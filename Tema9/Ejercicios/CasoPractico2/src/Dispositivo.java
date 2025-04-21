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
     * Métodos implementados de la interfaz Conectable
     *      Todos los dispositivos se ven afectados for estos métodos
     *      Como son iguales para todos los dispositivos se implementan aquí
     *      y ya cada clase heredada de Dispositivo tendrá los métodos para usarlos
     */
    @Override
    public void conectarWifi() {
        conectado = true;
    }

    @Override
    public void desconectarWifi() {
        conectado = false;
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }

    /**
     * Métodos adicionales
     */

    public void mostrarInfo() {
        System.out.println("Modelo: "+ modelo + "\nMarca: " + marca + "\nEstado de conexión: " + conectado);
    }

}
