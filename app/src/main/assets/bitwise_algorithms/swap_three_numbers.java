/**
 *
 **/
public class Solution {
    public void swap3Numbers(int[] a) {
        a[0] = a[0] + a[1] + a[2];
        a[1] = a[0] - (a[1] + a[2]);
        a[2] = a[0] - (a[1] + a[2]);
        a[0] = a[0] - (a[1] + a[2]);
    }

    public void swap3Numbers(int[] a) {
        a[0] = a[0] ^ a[1] ^ a[2];
        a[1] = a[0] ^ a[1] ^ a[2];
        a[2] = a[0] ^ a[1] ^ a[2];
        a[0] = a[0] ^ a[1] ^ a[2];
    }
}