package interfaces.interface1;

// // using abstract
// abstract class Computer {
//     public abstract void code();
// }

// class Laptop extends Computer {
//     public void code() {
//         System.out.println("code , compile , run...");
//     }
// }

// class Desktop extends Computer {
//     public void code() {
//         System.out.println("code , compile , run..., faster");
//     }
// }

// class Developer {
//     public void DevApp(Computer lap) {
//         // System.out.println("... coding");
//         lap.code();
//     }
// }

// public class Main2 {
//     public static void main(String[] args) {
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
//         Developer navin = new Developer();
//         navin.DevApp(lap);
//         navin.DevApp(desk);
//     }

// }

// // can create interface :

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code , compile , run...");
    }
}

class Desktop implements Computer {
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
        Computer lap = new Laptop(); // interface reference
        Computer desk = new Desktop();
        Developer navin = new Developer();
        navin.DevApp(lap);
        navin.DevApp(desk);
    }

}
