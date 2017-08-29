/**
 * Write a “C” function, int addOvf(int* result, int a, int b) If there is no overflow, the * function places the resultant = sum a+b in “result” and returns 0. Otherwise it returns -1.
 *
 * The solution of casting to long and adding to find detecting the overflow is not allowed.
 **/

public class Solution {
    public boolean checkOfOverflow(int a, int b) {
        if(a > 0 && b > 0  && (a + b) < 0) {
            return false;
        }
        if(a < 0 && b < 0 && (a + b) > 0) {
            return false;
        }
        return true;
    }
}