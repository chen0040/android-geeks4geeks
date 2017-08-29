/**
 * Given a number having only one ‘1’ and all other ’0’s in its binary representation, find
 * position of the only set bit.
 **/

public class Solution {
    public int findPositionOfOnlySetBit(int x) {
        if(!isPowerOfTwo(x)) return -1;
        int i = 1;
        int count = 1;
        while(!(x & i)) {
            i <<= 1;
            count++;
        }
        return count;
    }

    public boolean isPowerOfTwo(int x) {
        return (x & (x - 1)) == 0;
    }
}