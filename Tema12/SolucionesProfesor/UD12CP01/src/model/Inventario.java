package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventario {
    private int id;
    private String nombre;
    private int cantidad;
    private String comentario;
    private Date fecha;

    public Inventario(int id, String nombre, int cantidad, String comentario, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.comentario = comentario;
        this.fecha = fecha;
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Inventario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + sdf.format(fecha) +
                '}';
    }
}
