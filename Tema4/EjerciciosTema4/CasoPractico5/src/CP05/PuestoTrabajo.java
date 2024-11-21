package CP05;

public class PuestoTrabajo {

    private String codigo;
    private String descripcion;
    private double sueldoBruto;

    //Constructor
    public PuestoTrabajo(String codigo, String descripcion, double sueldoBruto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sueldoBruto = sueldoBruto;
    }

    //Getters & Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    //toString
    @Override
    public String toString() {
        return "PuestoTrabajo{" +
                "código='" + codigo + '\'' +
                ", sueldoBruto=" + sueldoBruto +
                '}';
    }
}
