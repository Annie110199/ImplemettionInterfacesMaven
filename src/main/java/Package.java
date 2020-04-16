

public class Package {
    private String name;
    private int mass;

    public Package(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass( int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return aPackage.mass== mass &&
                name.equals(aPackage.name);
    }

    @Override
    public int hashCode() {
        return (name + Integer.toString(mass)).hashCode();
    }
}
