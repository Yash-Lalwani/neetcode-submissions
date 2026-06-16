class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        Arrays.sort(strs);
        for (int i=0; i<strs[0].length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if (strs[j].length() == 0){
                    return "";
                }
                else if (strs[j].charAt(i) != strs[j-1].charAt(i)) {
                    if (i==0) {
                        return "";
                    }
                    else {
                        return str;
                    }
                }
            }
            str += strs[0].charAt(i);
        }
        return str;
    }
}