class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i));
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            }
            else {
                continue;
            }
        }


        int len = sb.length();
        for (int i = 0; i<len; i++) {
            if (sb.charAt(i) != sb.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }
}
