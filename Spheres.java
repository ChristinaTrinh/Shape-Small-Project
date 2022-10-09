//Each new create instance represents a Sphere that is also a Shape
public class Spheres implements Shape {
    private double r;

    public Spheres() {
        r = 0;
    }

    public Spheres(double r) {
        this.r = r;
    }

    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(this.r, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(this.r, 2);
    }

    public double getR() {
        return this.r;
    }
}
