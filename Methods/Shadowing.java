package Methods;

public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // shadowing
        System.out.println(x); // 40
        func();// 90

    }

    static void func() {
        System.out.println(x);
    }
}
