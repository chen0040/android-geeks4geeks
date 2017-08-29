/**
 * Given a integer x, write a function that multiplies x with 3.5 and returns the integer result. You are not allowed to use %, /, *.
 *
 * Examples:
 * Input: 2
 * Output: 7
 *
 * Input: 5
 * Output: 17 (Ignore the digits after decimal point)
 **/

public class Solution {
    public int multiplyBy3p5(int x) {
        return (x << 1) + x + (x >> 1);
    }
}