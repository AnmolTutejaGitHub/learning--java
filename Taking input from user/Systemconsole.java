//Don't use this 
//as many IDE's have disabled System.console().readLine();
//working on vs studio
public class Systemconsole {
    public static void main(String[] args) {
        String name = System.console().readLine("What is ur name ");
        System.out.println(name);
        // same as in python we do
        // name=input("what is ur name")

        int age = Integer.parseInt(System.console().readLine("Enter ur age "));
        System.out.println(age);
        // same as in python we do
        // age=int(input())
    }

}
