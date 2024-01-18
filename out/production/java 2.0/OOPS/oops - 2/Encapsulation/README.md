In Java, encapsulation means hiding things, by making them private, or inaccessible.

Why hide things?
Why would we want to hide things in Java?
To make the interface simpler, we may want to hide unnecessary details.
To protect the integrity of data on an object, we may hide or restrict access to some of the data and operations.
To decouple the published interface from the internal details of the class, we may hide actual names and types of class members.

What do we mean by interface here?
Although Java has a type called interface, that's not what we're talking about here.
When we talk about a class's public or published interface, we're really talking about the class members that are exposed to, or can be accessed by, the calling code.
Everything else in the class is internal, or private to it. 
An application programming interface, or API, is the public contract, that tells others how to use the class.

The problems when classes aren't properly encapsulated :
Allowing direct access to data on an object, can bypass checks and operations.
It encourages an interdependency, or coupling, between the calling code and the class.


Benefits of Encapsulation:
That's really one of the huge benefits of encapsulation, is that you're not actually affecting any other code.
It's sort of like a black box in many ways.

Staying in Control
This is why we want to use encapsulation.
We protect the members of the class, and some methods, from external access.
This prevents calling code from bypassing the rules and constraints, we've built into the class.
When we create a new instance, it's initialized with valid data.
But likewise, we're also making sure that there's no direct access to the fields.
That's why you want to always use encapsulation.


Encapsulation Principles : 
To create an encapsulated class, you want to:
Create constructors for object initialization, which enforces that only objects with valid data will get created.
Use the private access modifier for your fields.
Use setter and getter methods sparingly, and only as needed.
Use access modifiers that aren't private, only for the methods that the calling code needs to use.

