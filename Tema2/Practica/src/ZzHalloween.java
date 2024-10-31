public class ZzHalloween {

    public static final String RESET = "\u001B[0m";
    public static final String ORANGE = "\u001B[38;5;214m";
    public static final String GREEN = "\u001B[32m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        calabaza();
        System.out.println();
        murciegalo();
    }

    public static void calabaza() {
        System.out.println(GREEN + "      ,     ," + RESET);
        System.out.println(GREEN + "     (\\____/)" + RESET);
        System.out.println(ORANGE + "     (_'_'__)" + RESET);
        System.out.println(ORANGE + "   _ ( o_o_o ) _" + RESET);
        System.out.println(ORANGE + " /     `---'     \\" + RESET);
        System.out.println(ORANGE + " |               |" + RESET);
        System.out.println(ORANGE + "  \\             /" + RESET);
        System.out.println(GREEN + "   '-._______.-'" + RESET);
        System.out.println("\nFeliz Juagulín");
    }

    public static void murciegalo() {
        System.out.println(WHITE + "          /\\                 /\\" + RESET);
        System.out.println(WHITE + "         /  \\    /\\_/\\    /  \\" + RESET);
        System.out.println(WHITE + "        {    `-'     `-'    }" + RESET);
        System.out.println(WHITE + "         { O   O   O   O }" + RESET);
        System.out.println(WHITE + "          ~               ~" + RESET);
        System.out.println(WHITE + "           \\    v     v   /" + RESET);
        System.out.println(WHITE + "            \\_         _/" + RESET);
    }
}
