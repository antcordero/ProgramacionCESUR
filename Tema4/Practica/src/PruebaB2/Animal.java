package PruebaB2;

public class Animal {
    //Atributo
    private String nombre;

    //Constructor:
    public Animal(String nombre) {
        setNombre(nombre);
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos a implementar
    public void eat(){
        System.out.println("El animal esta comiendo.");
    }

    public void sleep() {
        System.out.println("El animal esta durmiendo.");
    }

    public void eat(String food) {
        System.out.println("El animal esta comiendo "+food);
    }


    //Metodo toString()
    @Override
    public String toString() {
        return "Nombre del animal: "+nombre;
    }
}
