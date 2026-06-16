class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length() - 1;
        int i = 0;
        while (i <= n) {
            while (i < n && !isAlphaNumeric(s.charAt(i))) {
                i++;
            }
            while (n > i && !isAlphaNumeric(s.charAt(n))) {
                n--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(n))) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
    public boolean isAlphaNumeric(char ch) {
        if (ch >= 'a' && ch <= 'z' || 
            ch >= 'A' && ch <= 'Z' ||
            ch >= '0' && ch <= '9') 
        {
            return true;
        }
        return false;
    }
}
