package ej3;

public class Plato {
    String nombre;
    private CategoriaPlato categoria;
    private double precio;

    public Plato(String nombre, CategoriaPlato categoria, double precio) {
        this.nombre = nombre;
        this.categoria = CategoriaPlato.valueOf(String.valueOf(categoria));
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaPlato getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        comprobarCategoria(categoria);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                '}';
    }

    //Métodos

    /*
     *  comprobar categoria como enum directamente
     */
    private void comprobarCategoria(String categoria) {
        switch (categoria.toUpperCase()) {
            case "ENTRANTE" -> this.categoria = CategoriaPlato.ENTRANTE;
            case "POSTRE" -> this.categoria = CategoriaPlato.POSTRE;
            case "PLATO_PRINCIPAL" -> this.categoria = CategoriaPlato.PLATO_PRINCIPAL;
        }
    }

    /*
     *  calcular precio final de un plato según categoria
     */

    public double calcularPrecioFinal() {
        double resultado = 0;
        switch (categoria) {
            case ENTRANTE -> resultado = precio * 0.9; //10%
            case POSTRE -> resultado = precio * 0.8; //20%
            default -> resultado = precio;
        }
        return resultado;
    }

}
