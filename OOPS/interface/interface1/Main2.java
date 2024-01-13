//package interface.interface1;

abstract class Computer {
    abstract void code();
}

class Laptop extends Computer {
    public void code() {
        System.out.println("code , compile , run...");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("code , compile , run..., faster");
    }
}

class Developer {
    public void DevApp(Computer lap) {
        // System.out.println("... coding");
        lap.code();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer navin = new Developer();
        navin.DevApp(lap);
        navin.DevApp(desk);
    }

}
