package CP03;

public class ProductoRefrigerado extends Producto{

    private String orgSupAlimentaria;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String orgSupAlimentaria) {
        super(fechaCaducidad, numeroLote);
        this.orgSupAlimentaria = orgSupAlimentaria;
    }

    public ProductoRefrigerado() {

    }

    public String getOrgSupAlimentaria() {
        return orgSupAlimentaria;
    }

    public void setOrgSupAlimentaria(String orgSupAlimentaria) {
        this.orgSupAlimentaria = orgSupAlimentaria;
    }

    //Métodos
    @Override
    public String toString() {
        return "Fecha Caducidad: " + super.getFechaCaducidad() +
                "\nNº Lote: " + super.getNumeroLote() +
                "\nOrganismo Supervisión Alimentaria: " + this.orgSupAlimentaria + "\n";
    }
}
