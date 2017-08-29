/**
 * Write a program to print Binary representation of a given number.
 **/

public class Solution {
    public String binaryRepresentation(int x) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1 << 31; i > 0; i >>= 1) {
            if((x & i) > 0) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
    }
}