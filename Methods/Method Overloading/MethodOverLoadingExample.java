// method overloading example 
//Create two methods with the same name: convertToCentimeters
//The first method has one parameter of type int, which represents the entire height in inches. You'll convert inches to centimeters,
// in this method, and pass back the number of centimeters, as a double.
//The second method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches.
// So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would be passed to this method.
// This method will convert feet and inches to just inches, then call the first method, to get the number of centimeters,
// also returning the value as a double.
//Both methods should return a real number or decimal value for total height in centimeters.
//Call both methods, and print out the results.
//The conversion formula from inches to centimeters is 1 inch = 2.54 cm.
//Also, remember one foot = 12 inches.
//You can use the link below to test your results:
//https://www.metric-conversions.org/length/feet-to-centimeters.htm

public class  MethodOverLoadingExample{

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm"); //5ft, 8in = 172.72cm
        System.out.println("68in = " + convertToCentimeters(68) + "cm"); //68in = 172.72cm
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
        //return convertToCentimeters((feet * 12) + inches);
    }
}
