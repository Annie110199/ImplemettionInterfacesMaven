public class ProductSetPackaged  implements IProduct, IPackagedProduct{
    private Package aPackage;
    private IPackagedProduct [] products;
    private String name;

    public Package getaPackage() {
        return aPackage;
    }

    public int getMassNetto() {
        int temp = 0;
        for (IPackagedProduct t : products){
            temp+=t.getMassNetto();
        }
        return temp;
    }

    public int getMassBrutto() {
        int temp = 0;
        for (IPackagedProduct t : products){
            temp+=t.getMassBrutto();
        }
        return temp;
    }

    public ProductSetPackaged(Package aPackage, IPackagedProduct[] products, String name) {
        this.aPackage = aPackage;
        this.products = products;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
