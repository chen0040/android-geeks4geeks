/**
 * Find whether a given number is a power of 4 or not
 **/

public class Solution {
    public boolean isPowerOf4(int x){
        if(x != 0 && isPowerOf2(x)) {
            int count = 0;
            while(n > 1) {
                n >>= 1;
                count++;
            }
            return count % 2 == 0;
        }
        return false;
    }

    public boolean isPowerOf2(int x) {
        return (x & (x-1)) == 0;
    }
}