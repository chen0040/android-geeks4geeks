/**
 * The problem is to convert the given binary number (represented as string) to its equivalent octal number. The input could be very large and may not fit even into unsigned long long int.
 *
 * Examples:
 *
 * Input : 110001110
 * Output : 616
 *
 * Input  : 1111001010010100001.010110110011011
 * Output : 1712241.26633
 **/
public class Solution {
    public String convertBinaryToOctal(String s) {
        int dot_index = s.indexOf('.');
        int len = s.length();
        int int_len = dot_index == -1 ? len : dot_index;
        int dec_len = dot_index == -1 ? 0 : len - dot_index - 1;
        String int_part = s.substring(0, dot_index);
        String dec_part = dec_len > 0 ? s.substring(dot_index+1) : "";
        if(int_len % 3 != 0) {
            for(int i=0; i < (3 - int_len % 3); ++i) {
                int_part = "0" + int_part;
            }
        }
        if(dec_len % 3 != 0) {
            for(int i=0; i < (3 - dec_len % 3); ++i) {
                dec_part = dec_part + "0";
            }
        }
        String int_octal = map2Octal(int_part);
        String dec_octal = map2Octal(dec_part);
        if(dec_len == 0) return int_octal;
        return int_octal + "." + dec_octal;
    }

    private String map2Octal(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < s.length(); i+=3) {
            sb.append(map2OctalDigit(s.substring(i, i+3)));
        }
        return sb.toString();
    }

    private int map2OctalDigit(String s) {
        int digit = 0;
        for(i = s.length()-1; i >=0; --i) {
            char c = s.charAt(i);
            if(c == '1') {
                digit = (digit << 1) + 1;
            } else {
                digit = (digit << 1);
            }
        }
        return digit;
    }
}
