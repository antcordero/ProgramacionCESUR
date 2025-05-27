package model;

import java.util.Date;

public class ProductoAlimenticio extends Producto {
    private Date fechaCaducidad;

    public ProductoAlimenticio(String codigo, String nombre, String tipo, double precio, Date fechaCaducidad) {
        super(codigo, nombre, tipo, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "ProductoAlimenticio{" + super.toString() + ", fechaCaducidad=" + fechaCaducidad + ", precio con IVA="+String.format("%.2f€",calcularPrecioFinal())+'}';
    }



    //Métodos abstractos de la clase que hereda y la interfaz que implementa
    @Override
    public String getTipo() {
        return "Alimenticio";
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.04; //4% IVA adicional para tipo alimenticio
    }
}
