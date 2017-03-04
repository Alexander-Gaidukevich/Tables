package beans;

public class Plate extends TableWare {

    public final String white = "white";

    private double radius;

    public Plate(String material, double radius) {
        super( material );
        this.radius = radius;
    }

    @Override
    public String getColorTableWare() {
        return white;
    }

    @Override
    public double getDoubleValue() {
        return radius*2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals( o )) return false;

        Plate plate = (Plate) o;

        return Double.compare( plate.radius, radius ) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits( radius );
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Plate{" + "\n material = " + getMaterial() +
                "\n radius=" + radius +
                '}';
    }
}
