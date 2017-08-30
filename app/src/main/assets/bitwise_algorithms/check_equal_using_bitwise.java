/**
 * Check if two numbers are equal without using arithmetic and comparison operators
 *
 * Following are not allowed to use
 * 1) Arithmetic and Comparison Operators
 * 2) String functions
 **/

public class Solution {
    public boolean checkEqual(int a, int b) {
        return ((a ^ b) == 0);
    }
}