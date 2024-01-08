
// not working wrong
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        // string builder
        StringBuilder as = new StringBuilder(a);
        StringBuilder bs = new StringBuilder(b);

        boolean flag = false;
        if (a.length() == b.length()) {

        }

        for (int i = 0; i < as.length(); i++) {
            for (int j = 0; j < as.length(); j++)
                if (("" + as.charAt(i)).equals("" + bs.charAt(j))) {
                    as.setCharAt(i, '1');
                    bs.setCharAt(j, '2');
                    break;
                }
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
