public class PuestoTrabajo {
    private String codigo;
    private double sueldoBruto;
    private String descripcion;

    public PuestoTrabajo(String codigo, double sueldoBruto, String descripcion) {
        this.codigo = codigo;
        this.sueldoBruto = sueldoBruto;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "PuestoTrabajo{" +
                "codigo='" + codigo + '\'' +
                ", sueldoBruto=" + sueldoBruto +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
