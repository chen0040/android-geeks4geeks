/**
 * Write a program to add one to a given number. You are not allowed to use operators like ‘+’, ‘-‘, ‘*’, ‘/’, ‘++’, ‘–‘ …etc.
 *
 * Examples:
 * Input: 12
 * Output: 13
 * Input: 6
 * Output: 7
 **/

public class Solution {
    public int addOneToGivenNumber(int num) {
        int m = 1;
        while((num & m) > 0) {
            num ^= m;
            m << 1;
        }
        num ^= m;
        return num;
    }
}