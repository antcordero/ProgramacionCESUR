package CP01;

public class Humano extends SerVivo {

    private String nombre;

    //Constructor
    public Humano(byte edad, String nombre) {
        super(edad);
        this.nombre = nombre;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos de la clase Humano
    public boolean equals(Humano otro) {
        return nombre.equals(otro.nombre) && this.getEdad() == otro.getEdad();
    }

    public SerVivo mayor(Humano otro) {
        SerVivo resultado;
        if (this.getEdad() > otro.getEdad() && this.nombre.length() > otro.nombre.length()) {
            resultado = this;
        } else {
            resultado = otro;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ". " + super.toString() + " años.";
    }
}
