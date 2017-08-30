/**
 * Given a string, write a function that returns toggle case of a string using the bitwise operators in place.
 *
 * In ASCII codes character ‘A’ is integer 65 = (0100 0001)2, while character ‘a’ is integer 97 = (0110 0001)2.
 *
 * The difference between the ASCII values of ‘a’ and ‘A’ is 32.
 *
 * So we can easily change the case of the letters either from Upper to lower or lower to upper by adding or subtracting the difference from the letters.
 *
 * Examples:
 *
 * Input : "GeekSfOrgEEKs"
 * Output : "gEEKsFoRGeekS"
 *
 * Input : "StRinG"
 * Output : "sTrINg"
 *
 * Approach:
 * The ASCII table is constructed in such way that the binary representation of lowercase letters is almost identical of binary representation of uppercase letters.
 *
 * 1. Lower case to CAPS
 * Bitwise XORing of a lowercase letter with a value of 65 (ASCII of ‘A’) or 90 (ASCII of ‘Z’) returns a value from 32 to 59, which upon bitwise ANDing with 32 always returns a nonzero of 32. So we convert it to uppercase.
 *
 * 2. CAPS to Lower case
 * Bitwise XORing of a uppercase letter with a value of 65 (ASCII of ‘A’) or 90 (ASCII of ‘Z’) returns a value from 0 to 27, which upon bitwise ANDing with 32 always returns a zero. So we convert it to lowercase as above.
 **/

public class Solution {
    public String toggleCase(String s) {
        StringBuilder sb =new StringBuilder();
        for(int i=0; i < s.length(); ++i) {
            sb.append((char)(s.charAt(i) ^ 32));
        }
        return sb.toString();
    }

    public String toggleCase2(String s) {
        char[] a = s.toCharArray();
        for(int i=0; i < a.length; ++i) {
            char c = a[i];
            int y = (int)((c ^ 65) & 32);
            if(y == 0) { // this is upper case
                a[i] &= ~(32); // to lower case
            } else { // this is lower case
                a[i] |= 32; // to upper case
            }
        }
        return new String(a);
    }
}