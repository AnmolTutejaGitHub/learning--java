package fibonacci;

import java.util.Scanner;

// find nth fibonacci  number
public class nth_fibonacci_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; // 2 numbers of series 0,1

        while (count <= n) {
            // need to add prev 2 nos.

            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
}
