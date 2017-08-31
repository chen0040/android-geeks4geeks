/**
 * Given a number n. Find sum of all number upto n whose 2 bits are set.
 *
 * Examples:
 *
 * Input : 10
 * Output : 33
 * 3 + 5 + 6 + 9 + 10 = 33
 *
 * Input : 100
 * Output : 762
 **/
public class Solution {
    public int sumOfNumbersWith2BitsSet(int n) {
        int sum = 0;
        for(int i=0; (1 << i) < n; ++i) {
            for(int j=0; j < i; ++j) {
                int k = (1 << i) + (1 << j);
                if(k <= n) sum+=k;
            }
        }
        return sum;
    }
}
