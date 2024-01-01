public class CodingExercise15 {
    public static boolean isOdd(int num){
        if(num<=0) return false;
        if(num%2==0) return false; //even 
        
        return true;
    }
    
    public static int sumOdd(int a , int b){
        if(a<0 || b<0 ) return -1;
        if(a>b) return -1;
        
        
        int sum=0;
        for(int i=a;i<=b;i++){
            if(isOdd(i)) sum+=i;
        }
        
    return sum;
        
    }
}