public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int j = 0;
        Set<Character> hs = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            while (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(s.charAt(i));
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}