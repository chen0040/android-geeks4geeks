/**
 * Given two non-negative numbers n and m. The problem is to find the largest number having n number of set bits and m number of unset bits in its binary representation.
 *
 * Note : 0 bits before leading 1 (or leftmost 1) in binary representation are counted
 *
 * Contraints: 1 <= n, 0 <= m, (m+n) <= 31
 * Examples:
 *
 * Input : n = 2, m = 2
 * Output : 12
 * (12)10 = (1100)2
 * We can see that in the binary representation of 12 there are 2 set and 2 unsets bits and it is the largest number.
 *
 * Input : n = 4, m = 1
 * Output : 30
 **/
public class Solution {
    public int largestNumWithNSetBitsAndMUnsetBits(int n, int m) {
        return ((1 << (n + m))-1) ^ ((1 << m) - 1);
    }
}