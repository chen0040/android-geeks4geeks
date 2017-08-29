/**
 * Given an array of positive integers. All numbers occur even number of times except one number
 * which occurs odd number of times. Find the number in O(n) time & constant space.
 **/

public class Solution {
    public int findNumberOccurringOddNumberOfTimes(int[] arr) {
        int res = 0;
        for(int i=0; i < arr.length; ++i) {
            res ^= arr[i];
        }
        return res;
    }
}