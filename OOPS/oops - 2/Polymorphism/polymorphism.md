## Movie theMovie = new Adventure("Star Wars"); // if I call a method it will call methods of Adventure class , and also I cant call methods that are not declared in parent class but are in child class

 You're absolutely right! Here's a breakdown of what's happening: 
 ```java
 class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing movie: " + title);
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    void play() {
        System.out.println("Playing adventure movie: " + title);
    }

    void specialFeature() {
        System.out.println("Showing special features of adventure movie.");
    }
}

 ```

 ```java
 Movie theMovie = new Adventure("Star Wars");
theMovie.play();  // Calls the overridden method in Adventure

 ```

 ✅ Reason:</br>

The method play() is overridden in the Adventure class, so Java will call the version defined in Adventure, thanks to runtime polymorphism.

Even though the reference type is Movie, the object is actually of type Adventure, so the overridden method is invoked. </br>

❌ But you cannot do this: </br>
```
theMovie.specialFeature();  // ❌ Error: Cannot find symbol
```
</br>

✅ Reason:</br>

The reference type (Movie) decides what methods are accessible.</br>

Since specialFeature() is not declared in the Movie class, it is not accessible through a Movie reference.</br>

Even though the object is an Adventure, the reference variable theMovie only knows about the methods defined in the Movie class.</br>

🔥 To call specialFeature(), you need to cast: </br>
```java
((Adventure) theMovie).specialFeature();  // ✅ Works fine
```
✅ Explanation:</br>
You are explicitly casting theMovie to Adventure, allowing you to call methods from the Adventure class.</br>

🔥 Final Usage: </br>
```java
public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Star Wars");
        
        // Call overridden method
        theMovie.play();  // Output: Playing adventure movie: Star Wars
        
        // Cast to access child-specific methods
        ((Adventure) theMovie).specialFeature();  // Output: Showing special features of adventure movie.
    }
}

```

output : </br>
``` java
Playing adventure movie: Star Wars
Showing special features of adventure movie.
```

✅ Summary:</br>

Methods declared in the parent class are accessible.</br>

Overridden methods in the child class are called dynamically at runtime.</br>

Methods exclusive to the child class require explicit casting.</br>


## You are explicitly casting theMovie to Adventure, allowing you to call methods from the Adventure class. // can I do it and also tell me what is type of theMovie 

✅ Yes, you can do it!</br>
You are absolutely allowed to explicitly cast theMovie to Adventure to call methods that are not declared in the parent class (Movie).</br>

📚 Type of theMovie </br>
```java
Movie theMovie = new Adventure("Star Wars");
```

📌 Type Analysis:</br>
Compile-time Type:</br>

theMovie is declared as type Movie (the parent class).</br>

This determines what methods can be accessed.</br>

At compile time, Java checks if the method you are trying to call is available in the Movie class.</br>

Since specialFeature() is not in Movie, you get a compilation error if you try:</br>
```java
theMovie.specialFeature();  // ❌ Error
```

Runtime Type:</br>

theMovie is referencing an object of type Adventure (the child class).</br>

At runtime, Java invokes the actual method of the object.</br>

This is why overridden methods in the Adventure class will be called when using theMovie.play().</br>

```java
theMovie.play();  // ✅ Calls Adventure's play() method
```

🔥 Explicit Casting:</br>
To access specialFeature() which is only in the Adventure class, you need to cast the object:</br>
```java
((Adventure) theMovie).specialFeature();  // ✅ Works fine
```

🎯 Why Explicit Casting Works:</br>
theMovie is actually referring to an Adventure object.</br>

Casting tells Java that this reference should be treated as an Adventure object.</br>

Now, you can access methods specific to the Adventure class.</br>

```java
class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing movie: " + title);
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    void play() {
        System.out.println("Playing adventure movie: " + title);
    }

    void specialFeature() {
        System.out.println("Showing special features of adventure movie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Star Wars");

        // Play method is overridden, so Adventure's version is called
        theMovie.play();  // Output: Playing adventure movie: Star Wars

        // Casting to access child class method
        ((Adventure) theMovie).specialFeature();  // Output: Showing special features of adventure movie.
    }
}

```

📝 Summary:</br>
theMovie has:</br>

Compile-time Type: Movie</br>

Runtime Type: Adventure</br>

Explicit casting ((Adventure) theMovie) allows access to methods specific to the Adventure class.</br>

## I can cast only child class

✅ Yes, exactly!</br>
You can only cast to the child class if the object is actually an instance of that child class.</br>

📚 Why Can You Only Cast to a Child Class?</br>
Upcasting (Implicit Cast)</br>

Casting from a child class to a parent class happens automatically.</br>

This is safe because a child class object is-a parent class object.</br>
```java
Adventure adventureMovie = new Adventure("Star Wars");
Movie theMovie = adventureMovie;  // ✅ Upcasting (Implicit)
Downcasting (Explicit Cast)
```

Casting from a parent class to a child class requires explicit casting.</br>

This works only if the object is actually of the child class type.</br>

```java
Movie theMovie = new Adventure("Star Wars");
Adventure advMovie = (Adventure) theMovie;  // ✅ Downcasting (Explicit)
advMovie.specialFeature();  // Works fine
```

❌ Invalid Cast Example:</br>
If you try to cast to a class that is not the actual type of the object, Java will throw a ClassCastException.</br>

```java
class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }
}

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Star Wars");

        // Valid cast
        Adventure advMovie = (Adventure) theMovie;  // ✅ Works fine
        
        // Invalid cast
        Comedy comMovie = (Comedy) theMovie;  // ❌ Throws ClassCastException
    }
}
```

Exception in thread "main" java.lang.ClassCastException: class Adventure cannot be cast to class Comedy</br>
🎯 Key Rule:</br>
✅ You can only cast to a child class if the object is actually an instance of that class.</br>

❌ Casting to an unrelated or incorrect class will cause a ClassCastException.</br>

🔥 Safe Casting Using instanceof:</br>
To avoid ClassCastException, you can use instanceof to check before casting:</br>

```java
if (theMovie instanceof Adventure) {
    Adventure advMovie = (Adventure) theMovie;
    advMovie.specialFeature();  // Safe cast
} else {
    System.out.println("Cannot cast to Adventure");
}
```
✅ Summary:</br>

You can only cast to a child class if the object is an instance of that class.</br>
Use instanceof to check before casting to prevent exceptions.</br>


## But I cant do Movie m = new AdventureMovie or can I ??


You absolutely can do this: </br>

```java
Movie m = new Adventure("Star Wars");
```

📚 Why Does This Work?</br>
Inheritance Rule:</br>

Adventure is a subclass of Movie.</br>

A parent class reference (Movie) can hold a reference to any of its child class objects (Adventure).</br>

This is called upcasting.</br>

✅ Upcasting Syntax:

```
java
ParentClass ref = new ChildClass();
```
```java
class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing movie: " + title);
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    void play() {
        System.out.println("Playing adventure movie: " + title);
    }

    void specialFeature() {
        System.out.println("Showing special features of adventure movie.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting - Parent reference holding child object
        Movie m = new Adventure("Star Wars");

        // Calling overridden method
        m.play();  // ✅ Calls Adventure's play() method due to runtime polymorphism

        // m.specialFeature();  // ❌ Compile-time error - Cannot call child-specific methods
    }
}
```
⚡️ Output:
```yaml
Playing adventure movie: Star Wars
```

📌 Why Does This Happen?</br>
Compile-Time Type (Movie):</br>

m is declared as a Movie, so the compiler only allows you to call methods that exist in the Movie class.</br>

You cannot call specialFeature() because it's not defined in the Movie class.</br>

Runtime Type (Adventure):</br>

At runtime, the actual object is of type Adventure.</br>

Overridden methods in Adventure are called due to runtime polymorphism.</br>

🔥 If You Want to Call Child-Specific Methods:</br>
To call methods like specialFeature(), you need to cast m back to Adventure:</br>

```java
if (m instanceof Adventure) {
    ((Adventure) m).specialFeature();  // ✅ Works fine after casting
}
```
❌ Invalid Case:
```java
Movie m = new Movie("Titanic");
Adventure adv = (Adventure) m;  // ❌ ClassCastException at runtime
```
You can’t cast a parent object (Movie) to a child (Adventure) unless it was originally created as an Adventure.</br>

🤯 In Simple Words:</br>
✅ Movie m = new Adventure(); – This works because Adventure is-a Movie.</br>

❌ Adventure a = new Movie(); – This will NOT work because a parent object cannot be treated as a child.</br>

📝 Summary:</br>
✅ Upcasting works: Movie m = new Adventure("Star Wars");</br>

✅ You can call overridden methods due to runtime polymorphism.</br>

❌ You can’t call child-specific methods without explicit casting.</br>

## why adventure adv = new Movie will not work
📚 Why This Will NOT Work:</br>

```java
Adventure adv = new Movie("Star Wars");  // ❌ Compilation Error
```

🔥 Reason:</br>
Inheritance Rule (Parent-to-Child):</br>

A parent class (Movie) reference can hold a child class object (Adventure), but...</br>

A child class (Adventure) reference cannot hold a parent class object (Movie).</br>

📌 Explanation:</br>
Parent-to-Child Assignment: ❌</br>

```java
Adventure adv = new Movie("Star Wars");  // ❌ Compile-Time Error
```
Movie does not have the additional functionality or specialized methods that Adventure may have.</br>

Since Movie is the parent, it lacks the specific properties or methods that might exist in Adventure.</br>

🎯 Example to Clarify:
```java
class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing movie: " + title);
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    void specialFeature() {
        System.out.println("Showing special features of adventure movie.");
    }
}
```
⚡️ Why This Fails: </br>

```java
Adventure adv = new Movie("Star Wars");  // ❌ Compile-time error
adv.specialFeature();  // ❌ Not possible
```

adv expects an Adventure object, but you're trying to assign a Movie object. </br>

Since Movie does not have the specialFeature() method or any subclass-specific methods, this assignment is not allowed. </br>

🤯 Why Upcasting Works but Downcasting Fails? </br>
✅ Upcasting (Child → Parent): </br>

```java
Movie m = new Adventure("Indiana Jones");  // ✅ Works
```

Safe because an Adventure is-a Movie.</br>

You can call Movie methods, and overridden methods will work via runtime polymorphism.</br>

❌ Downcasting (Parent → Child):</br>

```java
Adventure adv = new Movie("Star Wars");  // ❌ Compile-time error
```
Not allowed because a Movie is not necessarily an Adventure.</br>

Only works if the original object was created as an Adventure and then explicitly cast back.</br>

🔥 Correct Way to Downcast (If the Object is Originally a Child):

```java
Movie m = new Adventure("Indiana Jones");

// Safe downcasting
if (m instanceof Adventure) {
    Adventure adv = (Adventure) m;  // ✅ Works
    adv.specialFeature();  // ✅ Now accessible
}
⚡️ Exception with Invalid Downcast:
java
Copy
Edit
Movie m = new Movie("Star Wars");
Adventure adv = (Adventure) m;  // ❌ ClassCastException at runtime
```
This throws a ClassCastException because the actual object is a Movie, not an Adventure.</br>

📝 Summary:
✅ You can do Movie m = new Adventure(); because an Adventure is a Movie.</br>
❌ You cannot do Adventure adv = new Movie(); because a Movie is not necessarily an Adventure.</br>
✅ Downcasting requires explicit casting and works only if the object was originally a subclass instance.</br>


## and what about Object obj = Movie and type cast Object to Movie if want to access its methods ?
```java
Object obj = new Movie("Star Wars");

// Trying to access Movie methods
((Movie) obj).play();  // ✅ Works after type casting

```

📌 Explanation:</br>
Upcasting to Object:</br>

Object is the parent of all classes in Java.</br>

When you do: </br>

```java
Object obj = new Movie("Star Wars");
```
You are upcasting Movie to Object.</br>
✅ Upcasting works because Movie is-a Object.</br>
What Happens After Upcasting?</br>
When you upcast to Object, you lose access to the methods defined in Movie (or any child class).</br>
Only methods defined in Object (like toString(), hashCode(), etc.) can be accessed.</br>
🎯 To Access Movie Methods, You Need Downcasting:</br>
```java
// Downcast back to Movie
Movie m = (Movie) obj;
m.play();  // ✅ Now works
```
✅ Downcasting: You explicitly cast obj back to Movie to regain access to Movie methods.</br>

⚡️ Full Example:

```java
class Movie {
    String title;

    public Movie(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing movie: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting Movie to Object
        Object obj = new Movie("Star Wars");

        // Accessing Movie method after casting
        if (obj instanceof Movie) {
            Movie m = (Movie) obj;  // ✅ Downcasting
            m.play();  // Output: Playing movie: Star Wars
        } else {
            System.out.println("Not a Movie instance");
        }
    }
}
```
🎥 Output:
```yaml
Playing movie: Star Wars
```
📝 Important Notes:</br>
✅ Upcasting:</br>

```java
Object obj = new Movie("Star Wars");
```

Safe and automatic.</br>
Only Object methods are accessible.</br>

✅ Downcasting:</br>
```java
Movie m = (Movie) obj;
m.play();  // ✅ Works fine after downcasting
```

Requires explicit casting.</br>

Access to Movie methods is restored.</br>

Watch Out for ClassCastException:</br>

```java
Object obj = new Object();
Movie m = (Movie) obj;  // ❌ Throws ClassCastException
```
If obj is not actually a Movie, trying to cast it will throw a ClassCastException.</br>

🔥 Safe Way to Cast:</br>
Always check with instanceof before downcasting:</br>

```java
if (obj instanceof Movie) {
    Movie m = (Movie) obj;
    m.play();
} else {
    System.out.println("Not a Movie instance");
}
```
🤯 In Simple Words:</br>
✅ Upcast: Object obj = new Movie(); – No problem.</br>
✅ Downcast: Movie m = (Movie) obj; – Works if the object is actually a Movie.</br>
❌ Invalid Downcast: If the object is not a Movie, it throws ClassCastException.</br>