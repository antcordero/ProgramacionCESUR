package CP01;

public class SerVivo {
    private byte edad;

    //Constructor
    public SerVivo(byte edad) {
        this.edad = edad;
    }

    //Getters & Setters
    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    //Métodos de la clase
    public boolean equals(SerVivo otro) {
        return false;
    }

    public String toString(){
        return null;
    }

    public SerVivo mayor(SerVivo otro) {

        return otro;
    }

}
