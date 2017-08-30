/**
 * Given a number, the task is to multiply it with 10 without using multiplication operator?
 **/

public class Solution {
    public int multiply10(int n) {
        return (n << 3) + (n << 1);
    }
}