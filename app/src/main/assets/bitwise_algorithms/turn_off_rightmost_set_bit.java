/**
 * Write a C function that unsets the rightmost set bit of an integer.
 *
 * Examples:
 *
 * Input:  12 (00...01100)
 * Output: 8 (00...01000)
 *
 * Input:  7 (00...00111)
 * Output: 6 (00...00110)
 **/

public class Solution {
    public int turnOffRightMostSetBit(int x) {
        return x & (x - 1);
    }
}