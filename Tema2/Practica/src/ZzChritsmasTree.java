public class ZzChritsmasTree {

    // Códigos ANSI para darle color a los caracteres en la terminal
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String BROWN = "\u001B[38;5;94m";

    public static void main(String[] args) {
        printChristmasTree();
    }

    public static void printChristmasTree() {
        String[] colors = {RED, YELLOW, BLUE, WHITE};  // Colores para las "luces" del árbol

        int height = 10;  // Altura del árbol
        int width = 1;

        // Parte superior del árbol
        System.out.println(YELLOW + "          ★" + RESET);

        // Construimos el árbol con colores variados
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            // Decoración con luces en cada línea del árbol
            for (int k = 0; k < width; k++) {
                String color = colors[(i + k) % colors.length]; // Cambia de color cada vez
                System.out.print(color + "*" + RESET);
            }
            System.out.println();
            width += 2;  // Aumenta el ancho del árbol en cada nivel
        }

        // Tronco del árbol
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(BROWN + "| |" + RESET);
        }
    }
}

