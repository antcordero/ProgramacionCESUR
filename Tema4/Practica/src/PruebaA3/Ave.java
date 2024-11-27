package PruebaA3;

public class Ave extends Animal {
    private boolean puedeVolar;

    //CONSTRUCTOR
    public Ave(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }
    //GETTER Y SETTER
    public boolean isPuedeVolar() {
        return puedeVolar;
    }
    public void mostrarVuelo(){
        System.out.println("El ave loro puede volar");
    }
    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }



    //MÉTODO TOSTRING
    @Override
    public void emitirSonido() {
        System.out.println("El ave emite un sonido específico");
    }

    @Override
    public String toString() {
        return "Ave{" + "puedeVolar=" + puedeVolar + '}';
    }
}
