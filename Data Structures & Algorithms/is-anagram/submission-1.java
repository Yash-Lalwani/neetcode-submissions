class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        
        for (int i=0; i<sSort.length; i++) {
            hm1.put(sSort[i], hm1.getOrDefault(sSort[i], 0) + 1);
            hm2.put(tSort[i], hm2.getOrDefault(tSort[i], 0) + 1);
        }
        return hm1.equals(hm2);
    }
}
