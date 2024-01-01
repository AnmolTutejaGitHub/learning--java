package CodingExercise34;

public class Floor {
    // write code here
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;

        if (length < 0)
            this.length = 0;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

}