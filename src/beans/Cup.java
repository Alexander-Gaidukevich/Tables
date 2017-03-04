package beans;

public class Cup extends TableWare {

    public final String black = "black";

    private double volume;

    public Cup(String material, double volume) {
        super( material );
        this.volume = volume;
    }

    @Override
    public String getColorTableWare() {
        return black;
    }

    @Override
    public double getDoubleValue() {
        return volume*2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals( o )) return false;

        Cup cup = (Cup) o;

        return Double.compare( cup.volume, volume ) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits( volume );
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cup{" + "material = " + getMaterial() +
                "\n volume=" + volume +
                '}';
    }
}
