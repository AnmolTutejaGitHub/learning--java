import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums3.length; k++) {
                    if (nums1[i] == nums2[j])
                        ans.add(nums1[i]);
                    if (nums1[i] == nums3[k])
                        ans.add(nums1[i]);
                    if (nums2[j] == nums3[k])
                        ans.add(nums2[j]);
                }

            }
        }
        // removing duplicates
        for (int i = 0; i < ans.size(); i++) {
            if (list.indexOf(ans.get(i)) < 0)
                list.add(ans.get(i));
        }
        return list;
    }
}