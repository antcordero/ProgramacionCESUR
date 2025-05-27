package model.dao;

import model.Libro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

public class LibroDAO {
    private Set<Libro> resultado = new TreeSet<>();

    public Set<Libro> cargarLibros() {
        ResultSet rs=null;
        String sql = "select * from libros";
        try{
            rs=AccesoBD.consultaBD(sql);
            while(rs.next()){
                int idLibro = rs.getInt("idLibros");
                String isbn = rs.getString("isbn");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int valor = rs.getInt("prestamo");
                boolean disponible = (valor==1);
                Libro libro = new Libro(isbn, titulo, autor, disponible);
                libro.setIdLibros(idLibro);
                String codigo = calcularCodigo(libro.getIsbn());
                libro.setCodigo(codigo);
                resultado.add(libro);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    private String calcularCodigo(String isbn) {
        int contador = 1;
        StringBuilder codigo = new StringBuilder();
        for (Libro libro : resultado) {
            if (libro.getIsbn().equals(isbn))
                contador++;
        }
        codigo.append(isbn).append("-").append(contador);
        return codigo.toString();
    }

    public Libro insertarLibro(Libro libro) {
        Libro res=null;
        String sql = "insert into libros(isbn,titulo,autor,prestamo) values('"+libro.getIsbn()+"','"+libro.getTitulo()+"','"+libro.getAutor()+"',"+(libro.isEstado()?"1":"0")+");";
        try{
            if (AccesoBD.actualizaBD(sql)>0) {
                String codigo = calcularCodigo(libro.getIsbn());
                libro.setCodigo(codigo);
                res = libro;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
