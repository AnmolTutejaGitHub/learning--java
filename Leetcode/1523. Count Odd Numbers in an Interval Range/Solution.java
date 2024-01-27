//package Leetcode.1523. Count Odd Numbers in an Interval Range;

class Solution {
    public int countOdds(int low, int high) {
        // int count=0;
        // for(int i=low ; i<=high;i++){
        // if(i%2!=0) count++;
        // }
        // return count;

        // odd nos . btw 0 to 7 --> [1,3,5,7] ,,, 7/2 --> 3.5 round =4
        // odd nos btw 0 to 8 ---> [1,3,5,7] ,,, 8/2 ---> 4

        // n is odd then int(n/2) +1

        // odd nos bet 3to7
        // 0 to 3 ---> [1,3] //2
        // 0 to 7 ---> [1,3,5,7] //4
        // odd no btw 3 to 7 :: 4-2 + 1 =3 // +1 as 3 is inc twice // if 3 is odd //
        // means if low is odd

        // odd nos btw n to m

        // odd no bet 0 to m
        double ans = (double) high / 2; // as 21/2 = 10 integer/integer thats why 21.0/2 or (double)21/2 =10.5
        if (ans == (int) ans)
            ans = high / 2;
        else
            ans = ((int) (high / 2)) + 1;

        // odd no bet 0 to n
        double ans2 = (double) low / 2;
        if (ans2 == (int) ans2)
            ans2 = low / 2;
        else
            ans2 = ((int) (low / 2)) + 1;

        // return (int) (ans-ans2);
        System.out.println(ans);
        System.out.println(ans2);

        if (low % 2 != 0)
            return ((int) (ans)) - ((int) (ans2)) + 1;

        return ((int) (ans)) - ((int) (ans2));
    }
}
