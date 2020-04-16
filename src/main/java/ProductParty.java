import java.util.Arrays;

public class ProductParty {
    private String description;
    private IPackagedProduct[] products;

    public ProductParty(String description, IPackagedProduct[] products) {
        this.description = description;
        this.products = products;
    }

    public Package getaPackage() {
        return null;
    }

    public int getMassBrutto() {
        int temp = 0;
        for (IPackagedProduct t : products){
            temp+=t.getMassBrutto();
        }
        return temp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IPackagedProduct[] getProducts() {
        return products;
    }

    public void setProducts(IPackagedProduct[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductParty{" +
                "description='" + description + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return o.hashCode()==this.hashCode();
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }
}
