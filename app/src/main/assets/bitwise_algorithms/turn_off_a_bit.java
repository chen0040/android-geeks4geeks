/**
 * Given a number n and a value k, turn of the k’th bit in n.
 **/

public class Solution {
    public int turnOffABit(int n, int k) {
        if(k <= 0) return n;
        return n & (~(1 << (k-1)));
    }
}
