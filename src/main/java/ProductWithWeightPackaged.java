public class ProductWithWeightPackaged  implements IProduct, IPackagedProduct{
    private String name;
    private Package aPackage;
    private int mass;
    private ProductWithWeight product;

    public ProductWithWeightPackaged() {
        this.name = "";
        this.aPackage = null;
        this.mass = 0;
        this.product = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductWithWeightPackaged(String name, Package aPackage, int mass, ProductWithWeight product) {
        this.name = name;
        this.aPackage = aPackage;
        this.mass = mass;
        this.product = product;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public int getMassNetto() {
        return mass;
    }

    public void setMassNetto(int mass) {
        this.mass = mass;
    }
    public int getMassBrutto(){
        return mass + aPackage.getMass();
    }

    public ProductWithWeight getProduct() {
        return product;
    }

    public void setProduct(ProductWithWeight product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return o.hashCode()==this.hashCode();
    }

    @Override
    public int hashCode() {
        return (aPackage.toString() + Integer.toString(mass) + product.toString()).hashCode();
    }

    @Override
    public String toString() {
        return "ProductWithWeightPackaged{" +
                "aPackage=" + aPackage +
                ", mass=" + mass +
                ", product=" + product +
                '}';
    }
}
