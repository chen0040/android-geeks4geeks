/**
 * Given an fraction decimal number n and integer k, convert decimal number n into equivalent binary number up-to k precision after decimal point.
 *
 * Input: n = 2.47, k = 5
 * Output: 10.01111
 *
 * Input: n = 6.986 k = 8
 * Output: 110.11111100
 **/
public class Solution {
    public String convertDecimalToBinary(double n, int k) {
        int int_part = (int)(Math.floor(n));
        StringBuilder sb = new StringBuilder();
        while(int_part > 0) {
            sb.append(int_part % 2);
            int_part /= 2;
        }
        String int_part_string = sb.toString();

        sb = new StringBuilder();
        double dec_part = n - int_part;
        while(k > 0) {
            dec_part = n * 2;
            int d = (int)(Math.floor(dec_part));
            sb.append(d);
            k--;
        }

        if(k > 0) {
            return int_part_string + "." + sb.toString();
        } else {
            return int_part_string;
        }
    }
}