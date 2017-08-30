/**
 * Given a Binary Number as string, print its 2’s complements.
 **/
public class Solution {
    public String twoComplement(String s) {
        int i;
        StringBuilder sb = new StringBuilder();
        for(i=s.length()-1; i >= 0; --i){
            sb.append(s.charAt(i));
            if(s.charAt(i) == '1') {
                break;
            }
        }
        if(i == 0)  return "1" + s;

        for(int j = i-1; j >=0; --j) {
            sb.append(s.charAt(i));
        }

        sb.reverse();

        return sb.toString();
    }
}