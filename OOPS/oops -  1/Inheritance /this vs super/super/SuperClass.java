// The keyword super, is commonly used with method overriding, 
//when we call a method with the same name, from the parent class. 

public class SuperClass { // parent class aka super class
     public void printMethod() {
          System.out.println("Printed in SuperClass.");
     }
}

class Subclass extends SuperClass { // subclass aka child class
     // overrides methods from the parent class
     @Override
     public void printMethod() {
          super.printMethod();
          // calls the method in the SuperClass (parent)
          System.out.println("Printed in Subclass.");
     }

}

class MainClass {
     public static void main(String[] args) {
          Subclass s = new Subclass();
          s.printMethod();
     }

}