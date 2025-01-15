package tipoC.ej2;

public class Biblioteca {
    private Libro[] libros;

    //Constructor
    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }

    //Getters y Setters
    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    //toSrting
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Biblioteca:\n");
        for (Libro libro : libros) {
            if (libro != null) {
                sb.append(libro).append("\n");
            }
        }
        return sb.toString();
    }



    /*
     * metodo para calcular el valor total de los libros disponibles
     */
    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Libro libro : libros) {
            if (libro != null && !libro.isPrestado()) {
                valorTotal += libro.getPrecio();
            }
        }

        return valorTotal;
    }


}

