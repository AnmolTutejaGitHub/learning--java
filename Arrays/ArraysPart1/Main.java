package ArraysPart1;

public class Main {

    public static void main(String[] args) {

        // The size of an array, once created, is fixed.
        // We can't add or delete elements
        int[] myIntArray = new int[10]; // 10 -> size of array
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;
        myIntArray[9] = 98; // last index for this array remember size is 10
        System.out.println(myIntArray[6]); // 0

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]); // 3.5

        int theArray[] = new int[] { 1, 3, 68, 46 };

        // Java allows us to drop new int[], from the expression, as we show here.
        // This is known as an anonymous array.
        int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // anonymous array.
        // An anonymous array initializer, can only be used in a declaration statement.
        // means can't do :
        // int[] newArray;
        // newArray={ 5, 4, 3, 2, 1 }; //error
        System.out.println("first = " + firstTen[0]); // first = 1
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength); // length of array = 10
        System.out.println("last = " + firstTen[arrayLength - 1]); // last = 10

        int[] newArray;
        // newArray={ 5, 4, 3, 2, 1 }; //error
        newArray = new int[] { 5, 4, 3, 2, 1 };
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " "); // 5 4 3 2 1
        }
    }
}
