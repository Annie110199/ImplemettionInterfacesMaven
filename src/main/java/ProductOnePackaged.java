public class ProductOnePackaged  implements IProduct, IPackagedProduct{
    private ProductOne product;
    private int amount;
    private Package aPackage;

    public ProductOnePackaged(ProductOne product, int amount, Package aPackage) {
        this.product = product;
        this.amount = amount;
        this.aPackage = aPackage;
    }

    public ProductOne getProduct() {
        return product;
    }

    public void setProduct(ProductOne product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getMassNetto(){
        return amount*product.getMass();
    }
    public int getMassBrutto(){
        return amount*product.getMass()+aPackage.getMass();
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public String getName() {
        return product.getName();
    }
}
