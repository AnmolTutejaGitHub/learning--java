public class TernaryOperator {
    public static void main(String[] args) {

        // operan1 ? operand2:operand3;
        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true; // false
        // (makeOfCar == "Volkswagen") is condition to be evaluated ; if this condition
        // is true return operand2 else operand3

        //can also do : 
        //boolean isDomestic = (makeOfCar != "Volkswagen");

        /////////////////////////////////////////////////
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s); // This car is not domestic
    }
}
