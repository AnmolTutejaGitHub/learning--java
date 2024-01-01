//A plain old Java object (whose acronym is POJO) is a class that generally only has instance fields.
// It's used to house data, and pass data, between functional classes.
// It usually has few, if any methods other than getters and setters.
// Many database frameworks use POJO's to read data from, or to write data to, databases, files or streams.

// A POJO also might be called a bean, or a JavaBean. 
// A JavaBean is just a POJO, with some extra rules applied to it. 
// A POJO is sometimes called an Entity, because it mirrors database entities.  
// Another acronym is DTO, for Data Transfer Object.
// It's a description of an object, that can be modeled as just data.

//There are many generation tools, that will turn a data model into generated POJO's or JavaBeans.
// an example of similar code generation in IntelliJ, which allowed us to generate getters, setters, and constructors in a uniform way.

package POJO;

public class POJOMain {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
            // output of print :
            // Student{id='S923001', name='Mary', dateOfBirth='05/11/1985', classList='Java
            // Masterclass'}
            // Student{id='S923002', name='Carol', dateOfBirth='05/11/1985', classList='Java
            // Masterclass'}
            // Student{id='S923003', name='Tim', dateOfBirth='05/11/1985', classList='Java
            // Masterclass'}
            // Student{id='S923004', name='Harry', dateOfBirth='05/11/1985', classList='Java
            // Masterclass'}
            // Student{id='S923005', name='Lisa', dateOfBirth='05/11/1985', classList='Java
            // Masterclass'}
        }
    }

}
