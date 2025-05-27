package app;

import model.Libro;
import model.Prestamo;
import model.Usuario;
import model.dao.AccesoBD;
import model.dao.LibroDAO;
import model.dao.PrestamoDAO;
import model.dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class GestionBiblioteca {
    private Set<Usuario> usuarios;
    private Set<Libro> libros;
    private Set<Prestamo> prestamos;
    private Connection conn;
    private UsuarioDAO usrDAO;
    private LibroDAO libroDAO;
    private PrestamoDAO prestamoDAO;

    public GestionBiblioteca() {
        usuarios = new HashSet<Usuario>();
        libros = new TreeSet<Libro>();
        prestamos = new LinkedHashSet<>();
        try {
            conn = AccesoBD.conectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        usrDAO = new UsuarioDAO();
        libroDAO = new LibroDAO();
        prestamoDAO = new PrestamoDAO();
        cargarUsuarios();
        cargarLibros();
        cargarPrestamos();
    }

    public void mostrarUsuarios() {
        if (usuarios.isEmpty())
            System.out.println("No hay ningún usuario");
        else {
            System.out.println("USUARIOS");
            System.out.println("========");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
            System.out.println();
        }
    }

    public void mostrarLibrosDisponibles() {
        if (libros.isEmpty())
            System.out.println("No hay ningún libro");
        else {
            System.out.println("LIBROS DISPONIBLES");
            System.out.println("==================");
            for (Libro libro : libros) {
                if (libro.isEstado())
                    System.out.println(libro);
            }
            System.out.println();
        }
    }

    public void mostrarPrestamosActivos() {
        if (prestamos.isEmpty())
            System.out.println("No hay ningún préstamo activo");
        else {
            System.out.println("PRÉSTAMOS ACTIVOS");
            System.out.println("=================");
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
            }
            System.out.println();
        }
    }

    private void cargarUsuarios() {
        usuarios = usrDAO.cargarUsuarios();
    }

    private void cargarLibros() {
        libros = libroDAO.cargarLibros();
    }

    private void cargarPrestamos() {
        prestamos = prestamoDAO.cargarPrestamos();
    }

    public void agregarUsuario(Usuario u) {
        if (!usuarios.contains(u)) {
            if (usrDAO.insertarUsuario(u) > 0) {
                usuarios.add(u);
                System.out.println("Usuario agregado correctamente");
            }
        } else {
            System.out.println("El usuario ya existe");
        }
    }

    public void agregarLibro(Libro libro) {
        if (guardarLibro(libro) != null) {
            System.out.println("model.Libro agregado correctamente");
            libros.add(libro);
        } else {
            System.out.println("El libro no se puede agregar");
        }
    }

    private Libro guardarLibro(Libro libro) {
        return libroDAO.insertarLibro(libro);
    }

    public void agregarPrestamo(String nombre, String titulo) {
        String codigo = buscarLibroDisponible(titulo);
        Usuario usuario = buscarUsuario(nombre);
        if (usuario != null && codigo != null) {
            Prestamo p = new Prestamo(usuario.getDni(), codigo);
            List<Libro> losLibros = buscarLibro(titulo);
            Libro elLibro = null;
            for (Libro libro : losLibros) {
                if (libro.getCodigo().equals(codigo)) {
                    elLibro = libro;
                    elLibro.setEstado(false);
                }
            }
            if (elLibro != null && guardarPrestamo(p)>0) {
                modificarLibros(elLibro);
                prestamos.add(p);
                System.out.println("Prestamo realizado correctamente");
            } else {
                System.out.println("No se puede realizar este préstamo");
            }
        } else
            System.out.println("No se puede realizar este préstamo");
    }

    private int guardarPrestamo(Prestamo p) {
        int res = prestamoDAO.insertarPrestamo(p);
        return res;
    }

    private String buscarLibroDisponible(String titulo) {
        String res = null;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo) && libro.isEstado()) {
                res = libro.getCodigo();
            }
        }
        return res;
    }

    public Usuario buscarUsuario(String nombre) {
        Usuario u = null;
        for (Usuario usuario : usuarios) {
            if (nombre.equals(usuario.getNombre()))
                u = usuario;
        }
        return u;
    }

    public List<Libro> buscarLibro(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public void devolverPrestamo(String nombre, String titulo) {
        Usuario u = buscarUsuario(nombre);
        Libro elLibro = null;
        Prestamo elPrestamo = null;
        //Busco los préstamos del usuario u
        for (Prestamo p : prestamos) {
            if (p.getDni().equals(u.getDni())) {
                Libro l = dameLibro(p.getCodigo());
                //Si coincide el título del libro del préstamo con el que quiero devolver, lo devuelvo
                if (l != null && l.getTitulo().equals(titulo)) {
                    elPrestamo = p;
                    elLibro = l;
                }
            }
        }
        if (elLibro != null) {
            elLibro.setEstado(true);
            if (elPrestamo != null && modificarLibros(elLibro) > 0) {
                if (agregarPrestamoFinalizado(elPrestamo) > 0) {
                    eliminarPrestamo(elPrestamo);
                    System.out.println("Prestamo finalizado correctamente");
                }
            }
        }
    }

    private void eliminarPrestamo(Prestamo elPrestamo) {
        if (prestamoDAO.eliminarPrestamo(elPrestamo.getDni(), elPrestamo.getCodigo()) > 0) {
            prestamos.remove(elPrestamo);
        }
    }

    private int agregarPrestamoFinalizado(Prestamo elPrestamo) {
        return prestamoDAO.insertarPrestamoFinalizado(elPrestamo);
    }

    private int modificarLibros(Libro elLibro) {
        int res = 0;
        String sql = "UPDATE libros SET prestamo=" + (elLibro.isEstado()?"1":"0") + " WHERE idlibros=" + elLibro.getIdLibros();
        try {
            res = AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    private Libro dameLibro(String codigo) {
        Libro elLibro = null;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                elLibro = libro;
            }
        }
        return elLibro;
    }
}
