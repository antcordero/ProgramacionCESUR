package prueba;

public class Coche {
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private int anhoFabricacion;
    private boolean todoRiesgo;

    public Coche() {
    }

    public Coche(String modelo, String color, boolean metalizada, String matricula, int anhoFabricacion, boolean todoRiesgo) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.anhoFabricacion = anhoFabricacion;
        this.todoRiesgo = todoRiesgo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public boolean isTodoRiesgo() {
        return todoRiesgo;
    }

    public void setTodoRiesgo(boolean todoRiesgo) {
        this.todoRiesgo = todoRiesgo;
    }

    public void imprimeCoche(){
        System.out.println("Modelo: " + modelo+" Color: "+color);
    }
}
