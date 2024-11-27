package PruebaA3;

class Mamifero extends Animal {
    private String tipoDeAlimentacion;

    //CONSTRUCTOR
    public Mamifero(String nombre, int edad, String tipoDeAlimentacion) {
        super(nombre, edad);
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }


    // GETTER Y SETTER
    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public void mostrarAlimentacion(){
        System.out.println("El mamífero León es " + tipoDeAlimentacion);
    }

    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Mamifero{" + "tipoDeAlimentacion='" + tipoDeAlimentacion + '\'' + '}';
    }
}
