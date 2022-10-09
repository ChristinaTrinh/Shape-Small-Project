//Each new create instance represents a TrianglularPrisms that is also a Cube
public class TriangularPrisms extends Cubes {
    private double b;
    private double l;
    private double s1;
    private double s2;
    private double s3;

    public TriangularPrisms() {
        super();
        b = 0;
        l = 0;
        s1 = s2 = s3 = 0;
    }

    public TriangularPrisms(double h, double b, double l, double s1, double s2, double s3) {
        super(h);
        this.b = b;
        this.l = l;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double volume() {
        return 0.5 * b * this.getH() * l;
    }

    public double surfaceArea() {
        return (b * this.getH()) + (l * (s1 + s2 + s3));
    }
}
