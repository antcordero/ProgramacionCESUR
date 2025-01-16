package tipoC.ej2;

public class Libro {
    private String titulo;
    private double precio;
    private CategoriaLibro categoria;
    private boolean prestado;

    // Constructor
    public Libro(String titulo, double precio, String categoria) {
        this.titulo = titulo;
        this.precio = precio;
        comprobarCategoria(categoria);
        this.prestado = false; //Por defecto, un libro no está prestado
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CategoriaLibro getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        comprobarCategoria(categoria);
    }

    public boolean isPrestado() {
        return prestado;
    }

    //
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", prestado=" + (prestado ? "Sí" : "No") +
                '}';
    }


    //Métodos
    /*
     *  comprobarCategoria(categoria)
     */
    private void comprobarCategoria(String categoria) {
        switch (categoria.toUpperCase()) {
            case "FICCION" -> this.categoria = CategoriaLibro.FICCION;
            case "CIENCIA" -> this.categoria = CategoriaLibro.CIENCIA;
            case "HISTORIA" -> this.categoria = CategoriaLibro.HISTORIA;
        }
    }

    public void marcarPrestado() {
        this.prestado = true;
    }

}

