/**
 * Given a number n, the task is to find the XOR from 1 to n.
 *
 * Input : n = 6
 * Output : 7
 * // 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6  = 7
 *
 * Input : n = 7
 * Output : 0
 * // 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 = 0
 **/
public class Solution {
    public int computeXor(int n) {
        if(n % 4 == 0) {
            return n;
        }
        if(n % 4 == 1) {
            return 1;
        }
        if(n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}