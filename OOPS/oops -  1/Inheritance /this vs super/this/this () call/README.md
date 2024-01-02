In Java we've got the this() and super() call. Notice the parentheses.
These are known as calls, since it looks like a regular method call, although we're calling certain constructors.
Use this() to call a constructor, from another overloaded constructor in the same class.
The call to this() can only be used in a constructor, and it must be the first statement in a constructor.
It's used with constructor chaining, in other words when one constructor calls another constructor, and it helps to reduce duplicated code.
The only way to call a parent constructor, is by calling super(), which calls the parent constructor.

The Java compiler puts a default call to super(), if we don't add it, and it's always a call to the no argument constructor, which is inserted by the compiler.
The call to super() must be the first statement in each constructor.
A constructor can have a call to super() or this(), but never both.