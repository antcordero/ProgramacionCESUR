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

    //Métodos
    @Override
    public SerVivo mayor(SerVivo otro) {
        return super.mayor(otro);
    }

    public String toString(){
        return "Nombre: " + this.nombre;
    }
}
