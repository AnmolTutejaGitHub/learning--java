public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// The line House blueHouse = new House(“blue”); creates a new instance of the
// House class. Remember House is a blueprint, and we are assigning it to the
// blueHouse variable. In other words it is a reference to the object in memory.
// The image on the left hopefully makes sense to you now.

// The next line House anotherHouse = blueHouse; creates another reference to
// the same object in memory. Here we have two references pointing to the same
// object in memory. There is still one house, but two references to that one
// object.

// Next we have two println statements that print the blueHouse color and
// anotherHouse color. Both will print “blue” since we have two references to
// the same object.

// The next line calls the method setColor and sets the color to yellow. To the
// left you can that both blueHouse and anotherHouse have the same color now.
// Why? Remember we have two references that point to the same object in memory.
// Once we change the color, of one, both references still point to the same
// object. In our real world example, there is still just one physical house at
// that one address, even though we have written the same address on two pieces
// of paper.