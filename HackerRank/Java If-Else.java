import java.util.Scanner;
public class Solution {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    
    if(n%2!=0) System.out.println("Weird");
    else if(n>=2 && n<=5) System.out.println("Not Weird");
    else if(n>=6 && n<=20)  System.out.println("Weird");
    else if(n>20) System.out.println("Not Weird");
}
    
}
