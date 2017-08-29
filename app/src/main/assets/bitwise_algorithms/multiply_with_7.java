/**
 * We can multiply a number by 7 using bitwise operator. First left shift the number by 3 bits (you will get 8n) then subtract the original numberfrom the shifted number and return the difference (8n – n).
 **/

public class Solution {
    public void multiplyWith7(int x) {
        return (x << 3) - x;
    }
}