public abstract class Dispositivo implements Conectable {
    private String modelo;
    private String marca;
    private boolean conectado;

    public Dispositivo(String modelo, String marca, boolean conectado) {
        this.modelo = modelo;
        this.marca = marca;
        this.conectado = conectado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", conectado=" + conectado +
                '}';
    }

    /**
     * Métodos adicionales
     */

    public void mostrarInfo() {
        System.out.println("Modelo: "+ modelo + "\nMarca: " + marca + "\nEstado de conexión: " + conectado);
    }

}
