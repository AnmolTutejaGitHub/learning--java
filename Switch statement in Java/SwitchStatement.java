//Traditional Switch Statement 
public class SwitchStatement {
    public static void main(String[] args) {

        // int value = 3;
        // if (value == 1) {
        // System.out.println("Value was 1");
        // } else if (value == 2) {
        // System.out.println("Value was 2");
        // } else {
        // System.out.println("Was not 1 or 2");
        // }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                // this code will execute for switchValue ==3 0r ==4 or ==5
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }
}

// Fall through in switch statement :
// Once a switch case label matches the switch variable, no more cases are
// checked.
// Any code after the case label where there was a match found, will be
// executed, until a break statement, or the end of the switch statement occurs.
// Without a break statement, execution will continue to fall through any case
// labels declared below the matching one, and execute each case's code.
