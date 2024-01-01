// using 2 for loops

class GfG2
 {
	String encode(String str)
	{
           String ans="";
        for (int i = 0; i < str.length(); i++) {
        int count = 1;
        
        int i1 = i;
        for(i=i1;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) count++;
            
            else{break;}
        }
        
        ans+=""+str.charAt(i)+count;
        
        
	}
return ans;
	}
 }
