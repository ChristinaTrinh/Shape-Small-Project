//Each new create instance represents a Cylinders that is also a Sphere
public class Cylinders extends Spheres {
    private double h;

    public Cylinders() {
        super();
        h = 0;
    }

    public Cylinders(double r, double h) {
        super(r);
        this.h = h;
    }

    public double volume() {
        return 2 * Math.PI * this.getR() * h;
    }

    public double surfaceArea() {
        return 2 * Math.PI * this.getR() * (this.getR() + h);
    }

    public double getH() {
        return h;
    }
}
