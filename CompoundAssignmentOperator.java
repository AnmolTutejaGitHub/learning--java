public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int result = 10;
        result += 5;
        System.out.println(result); // 15

        // int result2 = 10;
        // result2 = result2 - 5.5;
        // System.out.println(result2); // error : can't convert from double to int

        // but this is working :
        int result2 = 10;
        result2 -= 5.5;
        System.out.println(result2); // 4

        int result3 = 10;
        result3 = (int) (result3 - 5.5);
        System.out.println(result3); // 4

        // When result is an int, the compound operator assignment
        // result2 -= 5.5;

        // give us a different result from what we expected, which was
        // result2 = result2 - 5.5;

        // The compound assignment operator
        // x -= y
        // is often said to be
        // x = x – y
        // but that's not entirely true if y is not the same data type as x.

        // x -= y
        // is really
        // x = (data type of x) (x - y)
        // An implicit cast is done when using this operator, so no error occurs, but
        // unexpected results may occur.

        // So, summarizing, for our own sample of code:
        // result2 -= 5.5;
        // is really,
        // result2 = (int)result2 - 5.5;

        // also notice ::
        double a = 5d / 3d;
        System.out.println(a); // 1.6666666666666667

        double a1 = 5 / 3;
        System.out.println(a1); // 1.0

        // Here, 5 and 3 are both integers, so the division operation / is performed
        // with integer division rules. In integer division, the result is also an
        // integer, and any remainder is discarded. So, 5 / 3 results in 1.

        // However, because you have declared a1 as a double, the result of the integer
        // division is automatically converted to a floating-point number. Therefore, a1
        // is assigned the value 1.0 (as 1 is cast to 1.0).

    }
}
