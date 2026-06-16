class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length-1;
    if (digits[n] != 9) {
        digits[n] = digits[n]+1;
    }
    else {
        while (n>=0 && digits[n] == 9) {
            digits[n] = 0;
            n--;
        }
        if (n < 0) {
            int[] digit = new int[digits.length+1];
            digit[0] = 1;
            for (int i=1; i<=digits.length; i++) {
                digit[i] = digits[i-1];
            }
            return digit;
        }
        else {
            digits[n] = digits[n]+1;
        }
    }
    return digits;
    }
}
