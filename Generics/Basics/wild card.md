# wild card in java 
In Java, a wildcard is a special character used in generics to represent an unknown type. There are two types of wildcards: the "?" wildcard and the "? extends" wildcard.

? Wildcard:

The ? wildcard represents an unknown type. It is often used when the exact type is not important, and you want to accept any type.

For example, in a method signature, you might see something like List<?> to indicate a list of elements of an unknown type.


    public void processList(List<?> list) {
        // Process the list, not knowing the exact type of its elements
    }