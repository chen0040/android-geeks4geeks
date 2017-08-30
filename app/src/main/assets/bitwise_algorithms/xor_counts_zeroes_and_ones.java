/**
 * Given a number, the task is to find XOR of count of 0s and count of 1s in binary representation of a given number.
 **/

public class Solution {
    public void xorCountsOf0and1s(int n) {
        int count0 = 0;
        int count1 = 0;
        while(n > 0) {
            if(n % 2 == 0) {
                count0++;
            } else {
                count1++;
            }
            n >>= 1;
        }
        return count0 ^ count1;
    }
}