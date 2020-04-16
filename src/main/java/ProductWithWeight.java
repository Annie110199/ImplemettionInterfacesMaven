

public class ProductWithWeight  implements IProduct{


    private String name;
    private String description;
    private int mass;

    public ProductWithWeight(String name, String description, int mass) {
        this.name = name;
        this.description = description;
        this.mass = mass;
    }

    public ProductWithWeight() {
        this.name = "";
        this.description = "";
        this.mass = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductWithWeight product = (ProductWithWeight) o;
        return (name.equals(product.name) &&
                description.equals(product.description) && product.mass == mass);
    }

    @Override
    public int hashCode() {
        return (name + description+ Integer.toString(mass)).hashCode();
    }

    @Override
    public String toString() {
        return "ProductWithWeight{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", mass=" + mass +
                '}';
    }
}


