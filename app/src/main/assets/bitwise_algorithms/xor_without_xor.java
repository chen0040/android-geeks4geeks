/**
 * Given two integers, find XOR of them without using XOR operator, i.e., without using ^ in C/C++.
 **/

public class Solution {
    public int xor(int a, int b) {
        return (a | b) & (~a | ~b);
    }
}