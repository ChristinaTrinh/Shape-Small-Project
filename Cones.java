//Each new create instance represents a Cones that is also a Cylinder
public class Cones extends Cylinders {
    private double s;

    public Cones() {
        super();
        s = 0;
    }

    public Cones(double r, double h, double s) {
        super(r, h);
        this.s = s;
    }

    public double volume() {
        return Math.PI * Math.pow(this.getR(), 2) * (this.getH() / 3);
    }

    public double surfaceArea() {
        return (Math.PI * this.getR() * s) + (Math.PI * Math.pow(this.getR(), 2));
    }
}
