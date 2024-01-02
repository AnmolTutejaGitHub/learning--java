// using this()

class Rectangle2 {
    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle2() {
        this(0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle2(int width, int height) {

        this(0, 0, width, height); // calls 3rd constructor
    }

    // 3rd constructor
    public Rectangle2(int x, int y, int width, int height) { // intialize variables
        this.x = x;
        this.y = y;

        this.width = width;
        this.height = height;
    }
}