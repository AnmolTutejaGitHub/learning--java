// method with return type example in java 
public class MethodReturns {

    public static int caclAge(int BirthYear) {
        return (2023 - BirthYear);

    }

    public static void main(String[] args) {
        int a = 2004;
        int age = caclAge(a);
        System.out.println(age); // 19
    }
}
