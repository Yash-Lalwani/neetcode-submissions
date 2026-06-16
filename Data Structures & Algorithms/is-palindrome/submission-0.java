class Solution {
    public static boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetterOrDigit(lowerS.charAt(i))) {
                sb.append(lowerS.charAt(i));
            }
        }
        System.out.print(sb.toString());

        int n = sb.length() - 1;
        for (int i=0; i<=n; i++) {
            if (sb.charAt(i) != sb.charAt(n)) {
                return false;
            }
            n--;
        }
        return true;
    }
}