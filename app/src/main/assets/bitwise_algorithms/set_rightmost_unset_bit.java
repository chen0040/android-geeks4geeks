/**
 * Given a non-negative number n. The problem is to set the rightmost unset bit in the binary representation of n. If there are no unset bits, then just leave the number as it is.
 *
 * Examples:
 *
 * Input : 21
 * Output : 23
 * (21)10 = (10101)2
 * Rightmost unset bit is at position 2(from right) as highlighted in the binary representation of 21.
 * (23)10 = (10111)2
 * The bit at position 2 has been set.
 *
 * Input : 15
 * Output : 15
 **/

class Solution {
    private int getRightmostUnsetBit(int n) {
        return Math.log((n ^ (~n))) / Math.log(2);
    }
    public int setRightmostUnsetBit(int n) {
        if(n==0) return 1;

        // check if all bits in are set
        if(n & (n+1) == 0) {
            return n;
        }

        int pos = getRightmostUnsetBit(n);
        return n | (1 << (pos-1));
    }
}

