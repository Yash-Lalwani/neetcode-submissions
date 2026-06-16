class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr = new char[word1.length() + word2.length()];
        int j = 0;
        for (int i=0; i<arr.length; i++) {
            if (j < word1.length()) {
                arr[i] = word1.charAt(j);
                if (j < word2.length()) {
                    i++;
                }
            }
            if (j < word2.length()) {
                arr[i] = word2.charAt(j);
            }
            j++;
        }

        String str = new String(arr);
        return str;
    }
}