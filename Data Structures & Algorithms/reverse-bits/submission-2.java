public class Solution {
    public int reverseBits(int n) {
        StringBuilder res = new StringBuilder();
        String binary = res.toString();


        for (int i=0; i<32; i++) {
            res.append((n & 1<<i) != 0 ? '1' : '0');
        }

        int ans = 0;
        String reversedBinary = res.reverse().toString();
        for (int i = 0; i < 32; i++) {
            if (reversedBinary.charAt(i) == '1') {
                ans |= (1 << i);
            }
        }
        
        return ans;
    }
}