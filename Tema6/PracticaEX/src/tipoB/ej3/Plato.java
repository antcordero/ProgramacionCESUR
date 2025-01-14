package tipoB.ej3;

public class Plato {
    private String nombre;
    private CategoriaPlato catPlato;
    private double precio;

    //
    public Plato(String nombre, String catPlato, double precio) {
        this.nombre = nombre;
        comprobarCatPlato(catPlato);
        this.precio = precio;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaPlato getCatPlato() {
        return catPlato;
    }

    public void setCatPlato(String catPlato) {
        comprobarCatPlato(catPlato);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //
    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", catPlato=" + catPlato +
                ", precio=" + precio +
                '}';
    }

    //Métodos
    private void comprobarCatPlato(String catPlato) {
        switch (catPlato.toUpperCase()) {
            case "ENTRANTE" -> this.catPlato = CategoriaPlato.ENTRANTE;
            case "PLATO PRINCIPAL" -> this.catPlato = CategoriaPlato.PLATO_PRINCIPAL;
            case "POSTRE" -> this.catPlato = CategoriaPlato.POSTRE;
        }
    }

    /*
     *  metodo calcularPrecioFinal que aplica un descuento en función de la categoría.
     */
    public double calcularPrecioFinal() {
        double resultado = 0;

        switch (this.catPlato) {
            case ENTRANTE -> resultado = this.precio * 0.95;
            case PLATO_PRINCIPAL -> resultado = this.precio * 0.90;
            case POSTRE -> resultado = this.precio * 0.85;
        }

        return resultado;
    }

}
