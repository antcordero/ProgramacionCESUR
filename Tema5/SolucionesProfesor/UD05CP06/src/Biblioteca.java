import java.util.Arrays;

public class Biblioteca {
    private Ejemplar[] ejemplares;

    public Biblioteca(int capacidadMax) {
        ejemplares = new Ejemplar[capacidadMax];
    }

    public Ejemplar[] getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Ejemplar[] ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "ejemplares=" + Arrays.toString(ejemplares) +
                '}';
    }

    public void agregarEjemplar(Ejemplar e) {
        int indice = buscarPosicion();
        if (indice >=0){
            ejemplares[indice] = e;
        } else {
            System.out.println("No hay espacio para almacenar este ejemplar");
        }
    }

    private int buscarPosicion(){
        int resultado = -1;
        int indice = 0;
        boolean encontrado = false;
        while(!encontrado && indice < ejemplares.length){
            if (ejemplares[indice] == null){
                resultado = indice;
                encontrado = true;
            }
            indice++;
        }
        return resultado;
    }

    public void eliminarEjemplar(String titulo) {
        int indice = 0;
        boolean encontrado = false;
        while(!encontrado && indice < ejemplares.length){
            if (ejemplares[indice] != null && ejemplares[indice].getTitulo().equals(titulo)){
                ejemplares[indice] = null;
                encontrado = true;
            }
            indice++;
        }
        if (encontrado){
            System.out.println("El ejemplar " + titulo + " se ha eliminado");
        } else {
            System.out.println("El ejemplar " + titulo + " no se ha encontrado");
        }
    }

    public void mostrarEjemplares() {
        System.out.println(this);
    }
}
