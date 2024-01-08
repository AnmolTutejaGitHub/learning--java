package Varargs;

public class basic {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(7);
        // note : for later ref : .show(int a ) is called not the overloaded .show(int
        // ...a) first it will look for exact signatures then it will look for varargs
        // it will give priority to method with exact no. of elements then method with
        // varargs

        // but If I want to pass multiple arguments and I don't know the number of args

        int[] arr = { 1, 2, 4 };
        obj.show2(arr); // 124

        System.out.println();

        // instead of forming array here java comes with new syntax ... args
        obj.show3(1, 2, 3, 5);// 1235 // can pass as many orguments as we want
    }
}

class Display {
    public void show(int a) {
        System.out.println(a);
    }

    // if we don't know how many arguments user is sending we can just use an array
    public void show2(int a[]) {
        for (int i : a)
            System.out.print(i);
    }

    public void show3(int... a) { // I don't know how many arguments I would be passing but take them but they
                                  // will be of type int
        // here a is array now

        for (int i : a)
            System.out.print(i);

    }

    // here I am overloading
    public void show(int... a) {
        System.out.println("called");
    }
}
