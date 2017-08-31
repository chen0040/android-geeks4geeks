/**
 * Given a non-negative number n and two values l and r. The problem is to toggle the bits in the range l to r in the binary representation of n, i.e, to toggle bits from the rightmost lth bit to the rightmost rth bit. A toggle operation flips a bit 0 to 1 and a bit 1 to 0.
 *
 * Constraint: 1 <= l <= r <= number of bits in the binary representation of n.
 *
 * Examples:
 *
 * Input : n = 17, l = 2, r = 3
 * Output : 23
 * (17)10 = (10001)2
 * (23)10 = (10111)2
 * The bits in the range 2 to 3 in the binary representation of 17 are toggled.
 *
 * Input : n = 50, l = 2, r = 5
 * Output : 44
 **/
public class Solution {
    public int toggleBits(int n,l, r) {
        int mask = ((1 << r) - 1) ^ ((1 << l) - 1);
        return n ^ mask;
    }
}