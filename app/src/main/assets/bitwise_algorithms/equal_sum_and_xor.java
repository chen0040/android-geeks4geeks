/**
 * Given a positive integer n, find count of positive integers i such that 0 <= i <= n and n+i = n^i
 **/

public class Solution {
    public int equalSumAndXor(int n) {
        int count0 = 0;
        while(n > 0) {
            if( (n & 1) == 0) count0++;
            n >>= 1;
        }
        return 1 << count0;
    }
}