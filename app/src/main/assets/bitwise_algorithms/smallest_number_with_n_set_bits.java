/**
 * Given two non-negative numbers n and m. The problem is to find the smallest number having n number of set bits and m number of unset bits in its binary representation.
 *
 * Constraints: 1 <= n, 0 <= m, (m+n) <= 31
 *
 * Note : 0 bits before leading 1 (or leftmost 1) in binary representation are counted
 *
 * Examples:
 *
 * Input : n = 2, m = 2
 * Output : 9
 * (9)10 = (1001)2
 * We can see that in the binary representation of 9 there are 2 set and 2 unsets bits and it is the smallest number.
 *
 * Input : n = 4, m = 1
 * Output : 23
 **/
public class Solution {
    public int smallestNumberWithNSetBitsAndMUnsetBits(int n, int m) {
        return (1 << (m + n - 1)) + ((1 << (n-1)) - 1);
    }
}
