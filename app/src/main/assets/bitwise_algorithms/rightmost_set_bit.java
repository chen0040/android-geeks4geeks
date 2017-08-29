/**
 * Write a one line C function to return position of first 1 from right to left, in binary representation of an Integer.
 *
 * I/P    18,   Binary Representation 010010
 * O/P   2
 * I/P    19,   Binary Representation 010011
 * O/P   1
 **/

public class Solution {
    public int findRightMostSetBitPosition(int x) {
        return (int)(Math.log(x & (-x)) / Math.log(2)) + 1;
    }
}