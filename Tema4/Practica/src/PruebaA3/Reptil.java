package PruebaA3;

public class Reptil extends Animal{
    private boolean esVenenoso;

    //CONSTRUCTOR
    public Reptil(String nombre, int edad, boolean esVenenoso) {
        super(nombre, edad);
        this.esVenenoso = esVenenoso;
    }
    //GETTER Y SETTER
    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public void mostrarPeligrosidad(){
        System.out.println("El reptil Serpiente es venenoso");
    }
    //MÉTODO TOSTRING

    @Override
    public String toString() {
        return "Reptil{" + "esVenenoso=" + esVenenoso + '}';
    }
    @Override
    public void emitirSonido() {
        System.out.println("El mamífero León emite un sonido específico");
    }
}
