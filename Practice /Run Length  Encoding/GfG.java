class GfG
 {
	String encode(String str)
	{
           String ans="";
        for (int i = 0; i < str.length(); i++) {

            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
              count++;
              i++;
            }

            ans+=""+str.charAt(i) + count;
        }
        return ans;
	}

	
 }
