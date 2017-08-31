/**
 * Count the minimum bits to flip such that XOR of A and B equal to C
 **/

public class Solution {
    public int countMinBitsToFlipXor(int a, int b, int c) {
        return Integer.bitCount(a ^ b ^ c);
    }

    public int countMinBitsToFlipXor(String a, String b, String c) {
        int N = a.length();
        int count = 0;
        for(int i=0; i < N; ++i) {
            if(a.charAt(i) == b.charAt(i) && c.charAt(i) == '1') {
                count++;
            }
            if(a.charAt(i) != b.charAt(i) && c.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }
}