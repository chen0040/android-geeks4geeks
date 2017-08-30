/**
 * For a given number n, if k-th bit is 0, then toggle it to 1 and if it is 1 then, toggle it to 0.
 **/
public class Solution {
    public int toggleKthBit(int n, int k) {
        return n ^ (1 << (k - 1));
    }
}