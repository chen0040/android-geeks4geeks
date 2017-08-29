/**
 * Given an array where every element occurs three times, except one element which occurs only once.
 *
 * Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.
 *
 * Example:
 * Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
 * Output: 2
 **/

public class Solution {
    static int findTheElementThatAppearOnce(int[] arr) {
        int ones = 0;
        int twos = 0;
        int common_mask = 0;
        for(int i=0; i < arr.length; ++i) {
            twos = twos | (ones & arr[i]);
            ones = ones ^ arr[i];
            common_mask = ~(ones & twos);
            twos &= common_mask;
            ones &= common_mask;
        }
        return ones;
    }
}