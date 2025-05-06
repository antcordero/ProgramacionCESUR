import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private Tarea tarea;
    private List<Tarea> listaTareas = new ArrayList<>();

    public GestorTareas() {
        this.tarea = new Tarea();
    }

    //Métodos

    /**
     * Metodo para agregar una tarea a la lista
     * @param titulo
     * @param descripcion
     * @param fecha
     */
    public void agregarTarea(String titulo, String descripcion, String fecha) {
        listaTareas.add(new Tarea(titulo, descripcion, fecha));
    }

    /**
     * Método para borrar la tarea por el nombre que recibe el método
     * @param titulo
     */
    public void eliminarTarea(String titulo) {

        boolean encontrado = false;

        for (Tarea t : listaTareas) {
            if (t.getTitulo().equals(titulo)){
                listaTareas.remove(t);
                encontrado = true;
            }

            if (encontrado) {
                break;
            }
        }
    }

    /**
     * Método para mostrar las tareas por pantalla usando el to String del objeto Tarea
     */
    public void mostrarTareas(){
        for (Tarea e : listaTareas){
            System.out.println(e.toString());
        }
    }
}
