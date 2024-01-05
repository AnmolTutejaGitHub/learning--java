#runtime and compile time type

You can think of the compile time type as the declared type.
This type is declared either as a variable reference, or a method return type, or a method parameter, for example.
In the case of LVTI, we don't declare a type for the compiled reference type, it gets inferred, but the byte code is the same, as if we had declared it.

In many cases, the compile time type, is the declared type to the left of the assignment operator.
What is returned on the right side of the assignment operator, from whatever expression or method is executed, sometimes can only be determined at runtime, when the code is executing conditionally, through the statements in the code.
You can assign a runtime instance, to a different compile time type, only if certain rules are followed.
We can assign an instance to a variable of the same type, or a parent type, or a parent's parent type, including java.lang.Object, the ultimate base class.

Why are runtime types different than compile time types?
Because of polymorphism.
Polymorphism lets us write code once, in a more generic fashion, like the code we started this lecture with.
We saw that those two lines of code, using a single compile time type of Movie (ref: Polymorphism3), actually supported four different runtime types.
Each type was able to execute behavior unique to the class.