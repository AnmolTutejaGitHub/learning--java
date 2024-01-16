package Generics.Basics;

public class Animal {

    public void eat() {
        System.out.println("eating .....");
    }

    public void sayMyName() {
        System.out.println("Animal");
    }

}

class Dog extends Animal {
    @Override

    public void sayMyName() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("cat eating .....");
    }

    @Override
    public void sayMyName() {
        System.out.println("Cat");
    }
}
