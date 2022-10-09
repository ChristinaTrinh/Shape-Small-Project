//Each new create instance represents a RectangularPrism that is also a Cube
public class RectangularPrisms extends Cubes {
    private double w;
    private double l;

    public RectangularPrisms() {
        super();
        w = 0;
        l = 0;
    }

    public RectangularPrisms(double h, double w, double l) {
        super(h);
        this.w = w;
        this.l = l;
    }

    public double volume() {
        return w * l * this.getH();
    }

    public double surfaceArea() {
        return 2 * (w * l + this.getH() * l + this.getH() * w);
    }
}
