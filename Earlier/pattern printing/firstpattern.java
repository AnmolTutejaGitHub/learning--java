// package pattern

// printing;
// # 1
// # 22
// # 333
// # 4444

public class firstpattern {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j = j + 1;
            }
            System.out.print("\n");
            i = i + 1;
        }
    }
}
