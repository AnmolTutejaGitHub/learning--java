//enhanced Switch statement 
//some of new features of switch statements

public class EnhancedSwitch {

    public static void main(String[] args) {

        // enchanced Switch statement (since JDK 9)

        // in enchanced switch statement no break statement is required

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter"); // XYZ is in the XYZ is bad quarter
    }

    public static String getQuarter(String month) {

        // as enhanced switch statement is an expression as can have it in return
        // statement
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                // return "1st"; //error
                yield "1st";
            }
            // U can't use return in code block {} in enhanced switch use yield keyword
            // instead
            // yield has to be inside codeblocks{} otherwise it will show error

            case "APRIL", "MAY", "JUNE" -> "2nd"; // --> "2nd" ; is implicitedly translated to {yield "2nd";}
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

        // return switch: This is the enhanced switch statement in Java. It evaluates
        // the expression within the parentheses (month) and then matches it against the
        // cases.

        // case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }: This case uses the
        // arrow operator (->) to directly return the value "1st" when the month is one
        // of "JANUARY", "FEBRUARY", or "MARCH". The yield keyword is used to return a
        // value from the switch expression. The curly braces {} are used to create a
        // block for multiple statements.

        // case "APRIL", "MAY", "JUNE" -> "2nd";: This case implicitly returns "2nd"
        // without the need for curly braces because it consists of a single expression.

        // case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";: Similar to the previous case,
        // it returns "3rd" for the specified months.

        // case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";: This case returns "4th" for
        // the specified months.

        // default -> { String badResponse = month + " is bad"; yield badResponse; }:
        // The default case is executed if none of the previous cases match. It creates
        // a badResponse string and yields that value. Again, the curly braces are used
        // for a block of statements.

        // Finally, the entire switch expression is wrapped with return, indicating that
        // the result of the switch expression will be returned from the method or block
        // containing this code. The yield keyword is used to produce a value from the
        // switch expression. The enhanced switch statement is more concise and
        // expressive than the traditional switch statement.
        // No, in traditional switch statements in Java, you cannot directly use the
        // return statement in the way demonstrated in the enhanced switch statement.

        ///////////////// About yield keyword:-
        // The yield keyword in Java is introduced as part of the enhanced switch
        // statement, which is a feature added in Java 12. It is specifically used
        // within the context of the enhanced switch to return a value from a switch
        // expression.

        // The choice of the yield keyword, as opposed to the return keyword, is
        // primarily for clarity and to avoid confusion with the traditional switch
        // statement. In the enhanced switch, the goal is to express the switch
        // statement as an expression that yields a value, and using yield makes it
        // clear that the value is being produced as a result of the switch expression.

        ////////////////////////////////////////////////////////////////////////////////////////////////////

        // //traditional way of getting quater of year :
        // public static String getQuarter(String month) {

        // switch (month) {
        // case "JANUARY":
        // case "FEBRUARY":
        // case "MARCH":
        // return "1st";

        // case "APRIL":
        // case "MAY":
        // case "JUNE":
        // return "2nd";

        // case "JULY":
        // case "AUGUST":
        // case "SEPTEMBER":
        // return "3rd";

        // case "OCTOBER":
        // case "NOVEMBER":
        // case "DECEMBER":
        // return "4th";

        // }

        // return "bad"
        // }

    }

}
