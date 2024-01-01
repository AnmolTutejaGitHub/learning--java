//if statement confusing case in java
public class IfStatementConfusingCase {
    public static void main(String[] args) {

        //case 1 :
        int isCar = 50;
//        if (isCar = 50) {
//           System.out.println("esrdtfyg");
//        } //error 



        //case2:
        boolean isCar2=false;
        if(isCar2=true){
            System.out.println("xcfgvh");
        }  //xcfgvh


        //in case2; isCar2 is assigned value true so the expression inside if returns true thus case is executed ;
        //in case1: isCar is assigned value 50 which is not a boolean ; if(50) will show ann error as if statement only evaluates for true or false condition

    }
}
