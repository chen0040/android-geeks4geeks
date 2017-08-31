/**
 * This problem is named after Flavius Josephus a Jewish historian who fought against the Romans. According to Josephus him and his group of Jewish soldiers were cornered & surrounded by the Romans inside a cave and they chose murder and suicide inside of surrender and capture. They decided that all the soldiers will sit in a circle and starting from the soldier sitting at the first position every soldier will kill the soldier to their in a sequential way. So if there are 5 soldiers sitting in a circle with positions numbered as 1, 2, 3, 4, 5. The soldier 1 kills 2, then 3 kills 4, then 5 kills 1, then 3 kills 5 and since 3 is the only one left then 3 commits suicide.
 *
 * Now Josephus doesn’t want to get murdered or commit suicide. He would rather be captured by the Romans and is presented with a problem. He has to figure out at which position should he sit in a circle (provided there are n men in total and the man sitting at position 1 gets the first chance to murder) so that he is the last man standing and instead of committing suicide he will surrender to the Romans.
 **/
public class Solution {
    public void findWinnerPosition(int n) {
        if((n & (n-1)) == 0) return 1;
        int pos = mostSignificantBit(n);
        n = n ^ (1 << (pos-1)); // n = n - 2 ^ a
        return (n << 1) | 1; // n = n * 2 + 1

    }

    private int mostSignificantBit(int n) {
        int pos = 0;
        while(n > 0) {
            pos++;
            n >>= 1;
        }
        return pos;
    }
}