/**
 * Write an efficient program to count number of 1s in binary representation of an integer.
 *
 * Examples
 *
 * Input : n = 6
 * Output : 2
 * Binary representation of 6 is 110 and has 2 set bits
 *
 * Input : n = 13
 * Output : 3
 * Binary representation of 11 is 1101 and has 3 set bits
 **/

public class Solution {
    public int countSetBits1(int n) {
        int count = 0;
        while(n > 0) {
            n >>= 1;
            count++;
        }
        return count;
    }

    public int countSetBits2(int n) {
        int count = 0;
        while(n > 0) {
            n &= (n-1);
            count++;
        }
        return count;
    }
}