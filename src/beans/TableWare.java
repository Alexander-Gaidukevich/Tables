package beans;

public abstract class TableWare {

    private String material;

    public TableWare(String material) {
        this.material = material;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract String getColorTableWare();

    public abstract double getDoubleValue();//возращает удвоенное знаечение

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableWare tableWare = (TableWare) o;

        return material.equals( tableWare.material );
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }

    @Override
    public String toString() {
        return "TableWare{" +
                "material='" + material + '\'' +
                '}';
    }
}
