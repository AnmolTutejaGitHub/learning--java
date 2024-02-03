package Recursion;

// print all binary strings of size N without consecutive ones 
public class binary_string_problem {
    public static void main(String[] args) {
        printBinStrings(3, 0, "");

        // 000
        // 001
        // 010
        // 011
        // 100
        // 101
        // 110
        // 111
    }

    public static void printBinStrings(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastPlace == 0) {
            printBinStrings(n - 1, 0, str + "0");
            printBinStrings(n - 1, 0, str + "1");
        } else {
            printBinStrings(n - 1, lastPlace, str + "0");
        }

    }
}
