class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) {
                    if(j-i-1 > maxLen) maxLen=j-i-1;
                } ;
                if (s.charAt(i)==s.charAt(j) && j-i+1==0) {
                    if(maxLen<0) maxLen=0;
                } ;
            }
        }
        return maxLen;
    }
}
