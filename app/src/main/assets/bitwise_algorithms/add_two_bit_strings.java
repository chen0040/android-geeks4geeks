/**
 * Given two bit sequences as strings, write a function to return the addition of the two sequences. Bit strings can be of different lengths also. For example, if string 1 is “1100011” and second string 2 is “10”, then the function should return “1100101”.
 **/

public class Solution {
    public String addTwoBitStrings(String a, String b) {
        String carry = and(a, b);
        a = xor(a, b);
        return addTwoBitStrings(a, carry);
    }

    private String and(String a, String b) {
        int i = a.length() -1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >=0) {
            if(a.charAt(i) == '1' && b.charAt(j) == '1'){
                sb.append(1);
            } else {
                sb.append(0);
            }
            i--;
            j--;
        }
        sb.reverse();
        return trim(sb.toString());
    }

    private String xor(String a, String b) {
        int i = a.length() -1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >=0) {
            if(a.charAt(i) == '1' != b.charAt(j)){
                sb.append(1);
            } else {
                sb.append(0);
            }
            i--;
            j--;
        }
        sb.reverse();
        return trim(sb.toString());
    }

    private String trim(String s) {
        StringBuilder sb = new StringBuilder();
        boolean firstOne = false;
        for(int i=s.length()-1; i >= 0; --i) {
            char c = s.charAt(i);
            if(!firstOne && c == '0') continue;
            firstOne = true;
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}