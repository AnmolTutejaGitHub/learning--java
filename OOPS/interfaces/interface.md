## Why multiple extend of interface doesn't case diamond problem in java

🎯 Why Doesn’t Multiple Inheritance with Interfaces Cause the Diamond Problem in Java?</br>
📚 1. What’s the Diamond Problem?</br>
💡 Diamond Problem:</br>
Occurs when a class inherits from two classes that have the same method, and the compiler doesn’t know which one to choose.</br>

🤯 Example in C++ (Diamond Problem):<br>
```cpp
class A {
public:
    void show() {
        cout << "A's show" << endl;
    }
};

class B : public A {};
class C : public A {};

// D inherits from both B and C
class D : public B, public C {};

int main() {
    D obj;
    obj.show();  // ❌ Error! Ambiguity - Which show() to call?
}
```
❌ Compiler Confused:</br>

D inherits show() from both B and C, causing ambiguity.</br>

📚 2. Why This Doesn’t Happen in Java with Interfaces?</br>
✅ Reason 1: Interfaces Don’t Store State</br>

Interfaces in Java:</br>

Only contain abstract methods (before Java 8).</br>

Cannot store any state or instance variables.</br>

So, no confusion arises about data inheritance.</br>

✅ Reason 2: Default Methods in Interfaces are Handled Explicitly</br>

Since Java 8, interfaces can have default methods.</br>

But Java forces you to explicitly handle conflicts if a class implements multiple interfaces with the same default method.</br>

🎥 Example:</br>

```java
interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

// C implements both A and B
class C implements A, B {
    // Override to resolve ambiguity
    @Override
    public void show() {
        A.super.show();  // Explicitly call A's show()
        // Or B.super.show() for B's show()
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();  // Explicitly calls A's show()
    }
}
```
✅ Output:

```yaml
A's show
```

👉 Why No Diamond Problem?</br>

If there’s a conflict between multiple interfaces, Java forces you to override and resolve it explicitly using:</br>

```java
A.super.show();
```
📚 3. Java Handles It at Compile Time</br>
If a class implements multiple interfaces with the same method, the compiler:</br>

Forces the class to override the method.</br>

This prevents ambiguity and avoids the diamond problem.</br>

🔥 4. Java’s Rule:</br>
✅ Classes use single inheritance (extends).</br>

✅ Interfaces allow multiple inheritance (implements).</br>

✅ If multiple interfaces define the same default method, the child class must resolve the conflict explicitly.</br>

📚 5. Example: No Diamond Problem with Abstract Methods</br>

```java
interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    @Override
    public void show() {
        System.out.println("C's implementation of show()");
    }
}
```
✅ Output:

```yaml
C's implementation of show()
```
🤯 6. What Happens with Default Methods?
```java
interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

// Diamond Situation, but Java forces resolution
class C implements A, B {
    @Override
    public void show() {
        B.super.show();  // Explicit resolution
    }
}
```
✅ Output:

```yaml
B's show
```
Method Conflict	Can cause confusion	Must be overridden</br>
🔥 Golden Rule:</br>
✅ Java avoids the diamond problem by requiring explicit conflict resolution with interfaces.</br>

✅ With multiple interfaces, if conflicts arise, Java forces you to override or choose explicitly.</br>

 ## default Access Modifier (For Classes, Methods, and Variables)
📚 ✅ What is default Access Modifier?</br>
When you don’t specify any access modifier, Java automatically assigns the default access modifier.</br>

Scope:</br>

Visible within the same package only.</br>

Cannot be accessed from a different package</br>

⚡️ Access Modifier Summary:</br>
Modifier	Same Class	Same Package	Subclass (Diff. Package)	Other Packages</br>
public	✅	✅	✅	✅</br>
protected	✅	✅	✅	❌</br>
default	✅	✅	❌	❌</br>
private	✅	❌	❌	❌</br>

 2. default Keyword in Interfaces (Java 8+)</br>
📚 ✅ What is default in Interfaces?</br>
Java 8 introduced default methods in interfaces.</br>

Purpose:</br>
To add new methods to an interface without breaking existing classes that implement it.</br>
Methods with default keyword have a concrete implementation in the interface.</br>

```java
interface Movie {
    void play();

    // Default method in interface
    default void info() {
        System.out.println("This is a movie.");
    }
}

// Class implementing Movie
class Adventure implements Movie {
    @Override
    public void play() {
        System.out.println("Playing adventure movie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m = new Adventure();
        m.play();  // Calls overridden method
        m.info();  // Calls default method from interface
    }
}

```

```yaml
Playing adventure movie.
This is a movie.
```
⚡️ Key Points for default in Interfaces:</br>
Default Methods: Concrete methods with body in an interface.</br>
Allows adding methods without affecting existing classes.</br>
Can be overridden in implementing classes.</br>

