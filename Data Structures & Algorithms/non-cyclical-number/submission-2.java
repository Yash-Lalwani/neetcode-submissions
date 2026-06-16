class Solution {
    public boolean isHappy(int n) {
        String str = Integer.toString(n);
        int sum = 0;
        while (sum != 1) {
            for (int i = 0; i<str.length(); i++) {
                sum += (str.charAt(i) - '0')*(str.charAt(i) - '0');
            }
            str = Integer.toString(sum);
            if (sum == 1) {
                return true;
            }
            else if (sum == 4 ) {
                return false;
            }
            else {
                sum = 0;
            }
        }
        return false;
    }
}