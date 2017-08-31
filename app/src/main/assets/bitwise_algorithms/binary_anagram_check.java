/**
 * Given a positive number you need to check whether it’s complement and the number are anagrams or not.
 *
 * Examples:
 *
 * Input : a = 4294967295
 * Output : Yes
 * Binary representation of 'a' and it's complement are anagrams of each other
 *
 * Input : a = 4
 * Output : No
 **/
public class Solution {
    public boolean isAnagramInBinaryRepresentation(int n) {
        return Integer.bitCount(n) == 16;
    }
}