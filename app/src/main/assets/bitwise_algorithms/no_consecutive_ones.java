/**
 * Given a number n, our task is to find all 1 to n bit numbers with no consecutive 1s in their binary representation.
 *
 * Examples:
 *
 * Input : n = 4
 * Output : 1 2 4 5 8 9 10
 * These are numbers with 1 to 4 bits and no consecutive ones in binary representation.
 *
 * Input : n = 3
 * Output : 1 2 4 5
 **/
public class Solution {
    boolean[] ans;
    public List<Integer> noConsecutiveOnes(int n) {
        ans = new boolean[(1 << n)];
        List<Integer> sol = new ArrayList<Integer>();
        build(n sol);
    }
    private void build(int n, List<Integer> sol) {
        if(sol.size() <= n) {
            int num = 0;
            for(i=0; i < sol.size(); ++i) {
                num <<= 1;
                num += sol.get(i);
            }
            ans[num] = true;

            int last_bit = sol.get(sol.size()-1);
            if(last_bit == 1) {
                List<Integer> sol1 = new ArrayList<Integer>(sol);
                sol1.add(0);
                build(n, sol1);
            } else {
                List<integer> sol1 = new ArrayList<Integer>(sol);
                sol1.add(0);
                build(n, sol1);
                List<Integer> sol2 = new ArrayList<Integer>(sol);
                sol2.add(1);
                build(n, sol2);
            }
        }
    }
}