class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isAlphaNumeric(s.charAt(i))) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int n = str.length() - 1;
        for (int i = 0; i <= n; i++) {
            if (str.charAt(i) != str.charAt(n)) {
                return false;
            }
            n--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || 
               (ch >= 'A' && ch <= 'Z') || 
               (ch >= '0' && ch <= '9');
    }
}
