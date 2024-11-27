package PruebaA3;

public class Test {
    public static void main(String[] args) {
        Mamifero leon = new Mamifero ("León", 5, "Canívoro");
        Ave loro = new Ave("Loro", 2, true);
        Reptil serpiente = new Reptil ("Serpiente", 3, true);
        leon.mostrarAlimentacion();
        leon.emitirSonido();
        leon.alimentar();
        loro.emitirSonido();
        loro.alimentar();
        serpiente.mostrarPeligrosidad();
        serpiente.emitirSonido();
        serpiente.alimentar();
    }
}
