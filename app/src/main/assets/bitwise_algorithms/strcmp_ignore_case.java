/**
 * Write a modified strcmp function which ignores cases and returns -1 if s1 < s2, 0 if s1 = s2, else returns 1.
 *
 * For example, your strcmp should consider "GeeksforGeeks" and "geeksforgeeks" as same string.
 **/

public class Solution {
    public int strcmpIgnoreCase(String a, String b) {
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();

        int i = 0;
        boolean not_equal = false;
        for(i=0; i < a_arr.length && i < b_arr.length; ++i) {
            if(a_arr[i] == b_arr[i] || (a_arr[i] ^ 32) == b_arr[i]) continue;
            else {
                not_equal = true;
                break;
            }
        }

        if(!not_equal) return Math.min(1, Math.max(-1, a_arr.length - b_arr.length));

        if((a_arr[i] | 32) < (b_arr[i] | 32)) return -1;
        return 1;
    }
}