import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        int goTill = 0;
        int start = 0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            goTill = Math.max(goTill,map.get(curr));
            if(i==goTill){
                ls.add(i-start+1); 
                start = i+1;
            }
        }
        return ls;
    }
}