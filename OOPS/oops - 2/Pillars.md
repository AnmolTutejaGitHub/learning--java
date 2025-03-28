## Abstraction means hiding implementation details and exposing only the necessary functionality.
It can be achieved in two ways:</br>
✅ Using abstract classes</br>
✅ Using interfaces</br>
Abstraction is about hiding implementation details and exposing only the necessary functionality to the user.</br>
```java
abstract class Movie {
    String title;

    // Constructor
    Movie(String title) {
        this.title = title;
    }

    // Abstract method (no implementation)
    abstract void play();

    // Concrete method (optional)
    void info() {
        System.out.println("Movie title: " + title);
    }
}

// Child class implementing abstract method
class Adventure extends Movie {
    Adventure(String title) {
        super(title);
    }

    @Override
    void play() {
        System.out.println("Playing adventure movie: " + title);
    }
}
```

✅ What’s Happening Here?</br>
Movie is an abstract class that hides the logic of play().</br>
Adventure implements the method and defines how play() works.</br>
The user only calls play() without knowing the inner workings.</br>
⚡️ Real-Life Analogy of Abstraction:</br>
Car:</br>
You know how to start the car (startEngine()).</br>
You don’t know how the engine works internally – that’s hidden (abstracted).</br>

## Encapsulation = Bundling data (variables) and methods into a single unit (class) + Restricting direct access to data.
Achieved using access modifiers:</br>
private, protected, public, default</br>
Encapsulation protects the data by controlling how it is accessed.</br>

## Polymorphism = Same method name, different behavior.
Two types:</br>
✅ Compile-time Polymorphism (Method Overloading)</br>
✅ Runtime Polymorphism (Method Overriding)</br>

## Inheritance allows one class to inherit the properties and behavior of another class.
✅ extends is used to inherit a class.