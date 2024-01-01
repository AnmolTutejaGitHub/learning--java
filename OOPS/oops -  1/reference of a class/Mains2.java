//reference of a class 
public class Mains2 {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor());// blue

        anotherHouse.setColor("red");

        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor());// red

        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor());// green
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

// The next line anotherHouse.setColor("red");
// calls the method setColor and sets the color to red. To the
// left you can that both blueHouse and anotherHouse have the same color now.
// Why? Remember we have two references that point to the same object in memory.
// Once we change the color, of one, both references still point to the same
// object.

// System.out.println(blueHouse.getColor()); // red
// System.out.println(anotherHouse.getColor());// red

// Here we have two println statements that are printing the color. Both now
// print “red” since we still have two references that point to the same object
// in memory.

// House greenHouse = new House("green");
// Here we are creating another new instance of the House class with the color
// set to “green”. Now we have two objects in memory but we have three
// references which are blueHouse, anotherHouse and greenHouse. The variable
// (reference) greenHouse points to a different object in memory, but blueHouse
// and anotherHouse point to the same object in memory.

// Here we assigns greenHouse to anotherHouse. In other words we are
// dereferencing anotherHouse. It will now point to a different object in
// memory. Before it was pointing to a house that had the “red” color, now it
// points to the house that has the “green” color. In this scenario we still
// have three references and two objects in memory but blueHouse points to one
// object while anotherHouse and greenHouse point to the same object in memory.

// Finally we have three println statements. The first will print “red" since
// the blueHouse variable(reference) points to the object in memory that has the
// “red" color, while the next two lines will print “green” since both
// anotherHouse and greenHouse point to same object in memory.

//////////////////////////////////////////////////////////////////

/*
 * 
 * new House("red"); // house object gets created in memory
 * 
 * House myHouse = new House("beige"); // house object gets created in memory
 * // and it's location (reference) is assigned to myHouse
 * 
 * House redHouse = new House("red"); /// house object gets created in memory
 * // and it's location (reference) is
 * // assigned to redHouse
 * 
 */

// On the first line new House("red");,
// we create a new House, and make it red.
// But we aren't assigning this to any variable.

// new House("red");
// This compiles fine, and you can do this.
// This object is created in memory, but after that statement completes, our
// code has no way to access it.
// The object exists in memory, but we can't communicate with it, after that
// statement is executed.
// We didn't create a reference to it.

// House myHouse = new House("beige");
// We create a reference to the house object we created.
// Our reference, myHouse, lets us have access to that beige house, as long as
// our variable, myHouse, stays in scope.

// House redHouse = new House("red");
// We're creating a red house again, but this is a different object altogether,
// from the red house we created on line one.
// This statement is creating another house object in memory, which has no
// relationship to the one we created on the first line(new House("red");).

/*
 * 
 * new House("red"); // house object gets created in memory
 * 
 * House myHouse = new House("beige"); // house object gets created in memory
 * // and it's location (reference) is assigned to myHouse
 * 
 * House redHouse = new House("red"); /// house object gets created in memory
 * // and it's location (reference) is
 * // assigned to redHouse
 * 
 */
// So this code has three instances of house, but only two references.
// That first object is said to be eligible for garbage collection, immediately
// after that first statement.
// It's no longer accessible.
// There are times we might want to instantiate an object, and immediately call
// a method on it.
// But 99% of the time, we'll want to reference the objects we create.
