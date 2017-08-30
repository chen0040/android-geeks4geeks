/**
 * Given an integer n > 0, the task is to find whether this integer has an alternate pattern in its bits representation. For example- 5 has an alternate pattern i.e. 101.
 *
 * Print “Yes” if it has an alternate pattern otherwise “No”. Here alternate pattern can be like 0101 or 1010.
 *
 * Input :  15
 * Output :  No
 * Explanation: Binary representation of 15 is 1111.
 *
 * Input :  10
 * Output :  Yes
 * Explanation: Binary representation of 10 is 1010.
 **/
public class Solution {
    public boolean hasBitAlternatePattern(int n) {
        int prev = n % 2;
        n = n / 2;
        while(n > 0) {
            int curr = n % 2;
            if(curr == prev)  return false;
            prev = curr;
            n /= 2;
        }
        return true;
    }
}