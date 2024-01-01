//if else , switch and scope 
public class SwitchAndScope {
    public static void main(String[] args) {
        int counter = 1;
        if (counter > 0) {
            int i = 10;
        } else {
            // System.out.println(i); //error :out of scope
        }
        // System.out.println(i); //error :out of scope

        // however the switch statement is different from if then else statement blocks
        int value = 5;
        switch (value) {
            // case 0:
            // System.out.println(j); //this in not ok j declared below
            case 1:
                int j = 10;
                break;

            default:
                j = value;
                System.out.println(j); // this is ok
                break;
        }
        // System.out.println(j); //error
    }

}
