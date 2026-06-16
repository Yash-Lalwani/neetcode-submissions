class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        
        StringBuilder ar = new StringBuilder(a).reverse();
        StringBuilder br = new StringBuilder(b).reverse();

        for (int i=0; i<Math.max(ar.length(), br.length()); i++) {
            int digitA = i < ar.length() ? ar.charAt(i) - '0' : 0;
            int digitB = i < br.length() ? br.charAt(i) - '0' : 0;

            int total = digitA + digitB + carry;
            res.append((char)((total % 2) + '0'));
            carry = total / 2;
        }
        
        if (carry == 1) {
            res.append('1');
        }
        
        return res.reverse().toString();
    }
}