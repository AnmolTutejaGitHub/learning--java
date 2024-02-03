package Recursion;

// print numbers from n to 1 using recursion 
public class print_numbers_n_to_1_recursion {

    public static void main(String[] args) {
        printDec(7); // 7 6 5 4 3 2 1
        printInc(7); // 1 2 3 4 5 6 7
        System.out.println();
        printInc(7, 1); // 1 2 3 4 5 6 7
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void printInc(int n, int start) {

        if (start == n) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(start + " ");
        printInc(n, start + 1);
    }

}
