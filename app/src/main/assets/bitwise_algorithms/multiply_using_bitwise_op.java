/**
 * Given two integers, write a function to multiply them without using multiplication operator.
 **/

public class Solution {
    public int multiply(int a, int b) {
        if(b == 0)  return a;
        int carry = a & b;
        a = a ^ b;
        return multiply(a, carry);
    }

    // russian peasant algorithm
    public int multiply2(int a, int b) {
        int res = 0;
        while(b != 0) {
            if((b & 1) > 0){
                res += a;
            }
            a <<= 1;
            b >>= 1;
        }
        return res;
    }
}