import java.util.ArrayList;

// Adding / removing elements from array in java 
// in python :

// my_array = [1, 2, 3]
// my_array.append(4)  # Adds 4 to the end of the array
// my_array.pop(2)  # Removes the element at index 2 (in this case, 3)

public class AddRemoveElements {

    public static void main(String[] args) {

        // adding element
        // Declare an array
        int[] myArray = { 1, 2, 3 };

        // Create a new array with an increased size
        int newSize = myArray.length + 1;
        int[] newArray = new int[newSize];

        // Copy elements from the original array to the new array
        System.arraycopy(myArray, 0, newArray, 0, myArray.length);

        // Add the new element to the end of the new array
        newArray[newSize - 1] = 4;

        // Update the reference to point to the new array
        myArray = newArray;

        // removing element
        // Remove the element at index 1
        int indexToRemove = 1;

        // Create a new array with a reduced size
        int newSizeAfterRemoval = myArray.length - 1;
        int[] newArrayAfterRemoval = new int[newSizeAfterRemoval];

        // Copy elements before the removal point
        System.arraycopy(myArray, 0, newArrayAfterRemoval, 0, indexToRemove);

        // Copy elements after the removal point
        System.arraycopy(myArray, indexToRemove + 1, newArrayAfterRemoval, indexToRemove,
                newSizeAfterRemoval - indexToRemove);

        // Update the reference to point to the new array
        myArray = newArrayAfterRemoval;

        // simple way use Arraylist
        // Create an ArrayList
        ArrayList<Integer> myList = new ArrayList<>();

        // Add elements to the ArrayList
        myList.add(1);
        myList.add(2);
        myList.add(3);

        // Print the ArrayList
        System.out.println("Original ArrayList: " + myList);

        // Add a new element to the ArrayList
        myList.add(4);

        // Print the ArrayList after adding
        System.out.println("ArrayList after adding: " + myList);

        // Remove an element from the ArrayList
        myList.remove(Integer.valueOf(2));

        // Print the ArrayList after removing
        System.out.println("ArrayList after removing: " + myList);
    }
}
