package tipoC.ej2;

public class Test {
    public static void main(String[] args) {

        //libros
        Libro libro1 = new Libro("El Señor de los Anillos", 25.50, "FICCION");
        Libro libro2 = new Libro("Breve historia del tiempo", 18.75, "CIENCIA");
        Libro libro3 = new Libro("Sapiens: De animales a dioses", 22.99, "HISTORIA");

        //Array de libros
        Libro[] libros = {libro1, libro2, libro3};

        //biblioteca
        Biblioteca biblioteca = new Biblioteca(libros);

        //Mostrar biblioteca inicial
        System.out.println(biblioteca);

        //Marcar un libro como prestado
        libro2.marcarPrestado();

        //Calcular y mostrar el valor total
        System.out.printf("Valor total de los libros disponibles: %.2f€\n", biblioteca.calcularValorTotal());
    }
}
