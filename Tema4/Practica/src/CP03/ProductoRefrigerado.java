package CP03;

public class ProductoRefrigerado extends Producto {

    private String OrgSupervision;

    //Constructor
    public ProductoRefrigerado(String fechaCaducidad, String numLote, String orgSupervision) {
        super(fechaCaducidad, numLote);
        OrgSupervision = orgSupervision;
    }

    //Getters - Setter
    public String getOrgSupervision() {
        return OrgSupervision;
    }

    public void setOrgSupervision(String orgSupervision) {
        OrgSupervision = orgSupervision;
    }

    //toString

    @Override
    public String toString() {
        return "ProductoRefrigerado: " + " OrganismoSupervisión = " + getOrgSupervision() + super.toString();
    }
}
