/**
 * Given two variables, x and y, swap two variables without using a third variable.
 **/

public class Solution {
    public void swapTwoNumbers1(int[] a) {
        a[0] = a[0] ^ a[1];
        a[1] = a[0] ^ a[1];
        a[0] = a[0] ^ a[1];
    }

    public void swapTwoNumbers2(int[] a) {
        a[0] = a[0] + a[1];
        a[1] = a[0] - a[1];
        a[0] = a[0] - a[1];
    }
}