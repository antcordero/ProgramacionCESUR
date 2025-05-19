package model;

import java.util.Date;

public class Inventario {
    private int id;
    private String nombre;
    private int cantidad;
    private String comentario;
    private Date fecha;

    public Inventario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                '}';
    }


}
