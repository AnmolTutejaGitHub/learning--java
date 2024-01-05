packages and import statement 

# package 
As per the Oracle Java Documentation:
A package is a namespace that organizes a set of related types.
In general, a package corresponds to a folder or directory, on the operating system, but this isn't a requirement.
When using an IDE, like IntelliJ, we don't have to worry about how packages and classes are stored on the file system.

The package structure is hierarchical, meaning you group types in a tree fashion.
You can use any legal Java identifier for your package names, but common practice has package names as all lower case.
The period separates the hierarchical level of the package.

Packages let us re-use common class names across different libraries or applications, and provide a way to identify the correct class, either with an import statement, or a qualifying name.
For example, you might have a package for utility classes, that can provide common functionality, for all of your classes to access.
Packages let us organize our classes by functionality, or relationships.
Packages also let us encapsulate our classes, from classes in other packages.
So you might have a package of tightly coupled classes, that should only be accessed by each other, but not by the outside world, as an example.

# What would a package name look like?
We've seen that Java starts their package names with java, in some of the examples we've looked at.
However, it is common practice, to use the reverse domain name to start your own package naming conventions.
If your company is abccompany.com for example, your package prefixes would be com.abccompany.

# The Fully Qualified Class Name (FQCN)
In this code, we created a class called Main.
A class's fully qualified class name (FQCN) consists of the package name and the class name.
So this class's fully qualified name is, dev.lpa.package_one.Main.

    package dev.lpa.package_one;
    import java.util.*;

    public class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random();
    }
    }

It's unlikely this class, with it's fully qualified name, will have a naming conflict, with a Main class in another package.
As another example, the fully qualified class name of the Scanner class in this code, is java.util.Scanner.


You can use the fully qualified class name, instead of the import statement as shown below .
This code does not use the import statement, but instead, where the Scanner class is referenced, the fully qualified class name is used.

    package dev.lpa.package_one;
    import java.util.*;
    public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); 
         Random random = new Random();
    }
    }


# default package 
In Java, the default package refers to the absence of a package declaration. When you create a Java class without specifying a package using the package keyword, it becomes part of the default package. The default package has no explicit name and is often discouraged for larger projects due to potential naming conflicts and organizational issues.

you can't import types from the default package into other classes, outside of the default package.


