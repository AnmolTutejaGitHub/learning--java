public class Cylinder extends Circle {
    // write code here
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        // return Math.PI * this.radius * this.radius * this.height;
        return super.getArea() * this.height;
    }
}