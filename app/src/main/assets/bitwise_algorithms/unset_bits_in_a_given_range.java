/**
 * Given a non-negative number n and two values l and r. The problem is to unset the bits in the range l to r in the binary representation of n, i.e, to unset bits from the rightmost lth bit to the rightmost rth bit.
 *
 * Constraint: 1 <= l <= r <= number of bits in the binary representation of n.
 *
 * Examples:
 *
 * Input : n = 42, l = 2, r = 5
 * Output : 32
 * (42)10 = (101010)2
 * (32)10 = (100000)2
 * The bits in the range 2 to 5 in the binary representation of 42 have been unset.
 *
 * Input : n = 63, l
 * Output : 48
 **/
public class Solution {
    public int unsetBitsInGivenRange(int n, int r, int l) {
        int mask = ((1 << r) - 1) ^ ((1 << l) - 1);
        mask = ((1 << 31) - 1) ^ mask;
        return n & mask;
    }
}