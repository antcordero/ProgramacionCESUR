public class ProductoRefrigerado extends Producto{
    private String codigo;

    public ProductoRefrigerado(String fechaCaducidad, String numLote, String codigo) {
        super(fechaCaducidad, numLote);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString()+" ProductoRefrigerado{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}
