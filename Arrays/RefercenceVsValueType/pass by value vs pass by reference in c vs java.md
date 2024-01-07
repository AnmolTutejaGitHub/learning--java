# pass by value vs pass by reference in java vs C 
In programming languages like C and Java, the concepts of "pass by value" and "pass by reference" are essential to understand how data is passed to functions or methods.

# Pass by Value:
# C:
In C, when you pass a variable to a function, you are passing its value. The function receives a copy of the variable's value, and any changes made to the parameter inside the function do not affect the original variable outside the function.

    #include <stdio.h>

    void modifyValue(int x) {
        x = x + 10;
    }

    int main() {
        int num = 5;
        modifyValue(num);
        printf("Original value: %d\n", num);  // Output: Original value: 5
        return 0;
    }


# Java:
Java is strictly pass-by-value, but it's important to note that when you pass an object to a method, you are passing the value of the reference to the object, not the actual object itself. This can sometimes lead to confusion.


    public class PassByValueExample {

    static void modifyValue(int[] arr) {
        arr[0] = arr[0] + 10;
    }

    public static void main(String[] args) {
        int[] array = {5};
        modifyValue(array);
        System.out.println("Original value: " + array[0]);  // Output: Original value: 15
    }
    }


# Pass by Reference:
C does not have true pass-by-reference like some other languages. However, you can achieve similar behavior by passing a pointer to a variable. This way, you can modify the variable through the pointer.


    #include <stdio.h>

    void modifyValue(int *x) {
        *x = *x + 10;
    }

    int main() {
        int num = 5;
        modifyValue(&num);
        printf("Original value: %d\n", num);  // Output: Original value: 15
        return 0;
    }


To summarize:

C is pass-by-value, but you can use pointers to achieve a form of pass-by-reference.
Java is also pass-by-value, but when you pass an object, you are passing the value of the reference to the object, not the object itself. This can lead to confusion, especially when dealing with mutable objects.
In both cases, understanding the underlying mechanism is crucial for effective programming.


# if array is passed in C without pointer then it is pass by value or pass by reference ?
In C, when you pass an array to a function, it is essentially passed by reference, but it might not work exactly as expected if you are familiar with pass-by-reference in other languages. When you pass an array to a function in C, you are actually passing a pointer to the first element of the array.

    #include <stdio.h>

    void modifyArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] += 10;
        }
    }

    int main() {
        int numbers[] = {1, 2, 3, 4, 5};
        int size = sizeof(numbers) / sizeof(numbers[0]);

    modifyArray(numbers, size);

    for (int i = 0; i < size; i++) {
        printf("%d ", numbers[i]);
    }

    return 0;
    }


In this example, the modifyArray function takes an array arr and modifies its elements. When you pass an array to a function in C, you are passing a reference to the array's first element. Any changes made to the array inside the function are reflected in the original array outside the function.

So, even though C is generally considered pass-by-value, when you pass an array, it behaves somewhat like pass-by-reference because the function receives a reference (pointer) to the original array.

but I didn't pass pointer ?
In C, when you pass an array to a function without explicitly using pointers, it is still passed by reference, even though you don't explicitly use the & (address-of) operator.

In C, arrays decay into pointers when passed to functions. So, when you pass an array to a function, what's actually passed is the memory address of the first element of the array. Therefore, any modifications made to the array inside the function will affect the original array outside the function.

Here's a simplified explanation:

    #include <stdio.h>

    void modifyArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] += 10;
        }
    }

    int main() {
        int numbers[] = {1, 2, 3, 4, 5};
        int size = sizeof(numbers) / sizeof(numbers[0]);
  
    modifyArray(numbers, size);

    for (int i = 0; i < size; i++) {
        printf("%d ", numbers[i]);  // Output: 11 12 13 14 15
    }

    return 0;
    }


In this example, modifyArray receives a reference to the original array numbers, allowing it to modify the array in-place. So, even though you didn't explicitly pass a pointer, the array is effectively passed by reference in this context.

# in java a method takes copy of reference for an object  ?

Yes, in Java, when you pass an object (including arrays) to a method, you are effectively passing a copy of the reference to the object, not a copy of the object itself. Java is strictly pass-by-value, but it's important to understand how this works with objects.

    public class PassByValueExample {

    static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        modifyArray(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");  // Output: 11 12 13 14 15
        }
    }
    }

So, while Java, when you pass an object (including arrays), you are passing a copy of the reference, and changes to the object's state inside the method are reflected outside the method.

# swap function  in c vs java 

# c 
    #include <stdio.h>

    void swap(int *a, int *b) {
        int temp = *a;
        *a = *b;
        *b = temp;
    }

    int main() {
        int num1 = 5, num2 = 10;

        printf("Before swap: num1 = %d, num2 = %d\n", num1, num2);
        swap(&num1, &num2);
        printf("After swap: num1 = %d, num2 = %d\n", num1, num2);

        return 0;
    }


# java 
In Java, primitive types are passed by value, which means when you pass a primitive variable to a method, you are passing a copy of the variable's value. As a result, a direct swap function for primitive types is not feasible because changes made to the parameters inside the method will not affect the original values outside the method.

However, you can achieve a similar effect by using a custom class or an array. Here's an example using an array for swapping two integers:

    public class SwapExample {

    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10};

        System.out.println("Before swap: num1 = " + numbers[0] + ", num2 = " + numbers[1]);
        swap(numbers);
        System.out.println("After swap: num1 = " + numbers[0] + ", num2 = " + numbers[1]);
    }
    }

In this example, an array of integers is used to simulate a swap. The swap method takes an array as a parameter, and the array elements are modified to achieve the swap effect.

For non-array types like int, double, etc., you can create a simple class to encapsulate the values and perform the swap:

    public class IntWrapper {
        int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }

    public class SwapExample {

        static void swap(IntWrapper a, IntWrapper b) {  // now passed as object 
            int temp = a.value;
            a.value = b.value;
            b.value = temp;
        }

        public static void main(String[] args) {
            IntWrapper num1 = new IntWrapper(5);
            IntWrapper num2 = new IntWrapper(10);

            System.out.println("Before swap: num1 = " + num1.value + ", num2 = " + num2.value);
            swap(num1, num2);
            System.out.println("After swap: num1 = " + num1.value + ", num2 = " + num2.value);
        }
    }



