# abstract class vs interface in java
In Java, both interfaces and abstract classes provide a way to achieve abstraction, but they have some differences in terms of usage and characteristics. The choice between using an interface or an abstract class depends on the specific requirements of your design.

Here are some key differences between interfaces and abstract classes in Java:

# Multiple Inheritance:
Interfaces support multiple inheritance, allowing a class to implement multiple interfaces. On the other hand, a class can extend only one abstract class. If your design requires a class to inherit behavior from multiple sources, interfaces might be more suitable.


# Constructor:
Abstract classes can have constructors, whereas interfaces cannot. This is important if you need to perform some initialization when an object of the class is created.

# Method Implementation:
In an abstract class, you can have both abstract methods (methods without a body) and concrete methods (methods with a body). In interfaces, all methods are implicitly abstract, and they must be implemented by the implementing class.

# Access Modifiers:
In an interface, all methods are public by default. In an abstract class, you can have a variety of access modifiers for methods.

# Fields:
Abstract classes can have instance variables (fields) that can be inherited by subclasses. Interfaces, on the other hand, can only have constants (public static final fields) and not instance variables.

# Evolution of Code:
If you add a new method to an interface, you have to provide an implementation in all classes that implement the interface. In contrast, if you add a new method to an abstract class, you can provide a default implementation, and existing subclasses are not forced to implement it.

# Here are some general guidelines to help you decide:
# Use Interfaces When:
You want to achieve multiple inheritance.
You have a set of unrelated classes that need to share a common set of methods (method signature).

# Use Abstract Classes When:
You want to provide a common base implementation for multiple classes.
You want to share code among related classes.
You need to define fields (instance variables) that should be inherited by subclasses.


In many cases, a combination of both interfaces and abstract classes is used to achieve the desired design. The choice ultimately depends on the specific requirements of your application and the relationships between the classes in your design.

# both abstract methods and interface can have  static methods