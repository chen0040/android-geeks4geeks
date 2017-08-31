/**
 * Given a non-negative number n. The problem is to toggle the last m bits in the binary representation of n. A toggle operation flips a bit 0 to 1 and a bit 1 to 0.
 *
 * Examples:
 *
 * Input : n = 21, m = 2
 * Output : 22
 * (21)10 = (10101)2
 * (22)10 = (10110)2
 * The last two bits in the binary representation of 21 are toggled.
 *
 * Input : n = 107, m = 4
 * Output : 100
 **/
public class Solution {
    public int toggleLastMBits(int n, int m) {
        return n ^ ((1 << m) -1)
    }
}