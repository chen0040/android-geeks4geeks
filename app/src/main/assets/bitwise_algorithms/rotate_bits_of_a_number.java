/**
 * Bit Rotation: A rotation (or circular shift) is an operation similar to shift except that the bits that fall off at one end are put back to the other end.
 *
 * In left rotation, the bits that fall off at left end are put back at right end.
 *
 * In right rotation, the bits that fall off at right end are put back at left end.
 **/

public class Solution {
    public int leftRotate(int x, int d){
        return (x << d) | (x >> (32 - d));
    }

    public int rightRotate(int x, int d) {
        return (x >> d) | (x << (32 - d));
    }
}