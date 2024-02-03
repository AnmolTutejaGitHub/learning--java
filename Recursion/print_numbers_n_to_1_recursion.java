package Recursion;

// print numbers from n to 1 using recursion 
public class print_numbers_n_to_1_recursion {

    public static void main(String[] args) {
        printDec(7); // 7 6 5 4 3 2 1
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }

}
