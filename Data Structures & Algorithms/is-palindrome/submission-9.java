class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        for (int i=0; i<s.length(); i++) {
            if (isAlphaNumeric(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }

        int n = str.length() - 1;
        for (int i=0; i<=n; i++) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(n))) {
                return false;
            }
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
