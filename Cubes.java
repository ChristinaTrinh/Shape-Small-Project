//Each new create instance represents a Cube that is also a Shape
public class Cubes implements Shape {
    private double h;

    public Cubes() {
        h = 0;
    }

    public Cubes(double h) {
        this.h = h;
    }

    public double volume() {
        return Math.pow(this.h, 3);
    }

    public double surfaceArea() {
        return Math.pow(this.h, 2) * 6;
    }

    public double getH() {
        return h;
    }
}
