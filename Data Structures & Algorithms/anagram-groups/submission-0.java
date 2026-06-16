class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        // ADDED: track which strings are already grouped
        boolean[] used = new boolean[strs.length];

        for (int i=0; i<strs.length; i++) {

            // ADDED: if already grouped, skip
            if (used[i]) continue;

            List<String> list = new ArrayList<>();
            list.add(strs[i]);

            // ADDED: mark i as used
            used[i] = true;

            for (int j=i+1; j<strs.length; j++) {

                // ADDED: if already grouped, skip
                if (used[j]) continue;

                if (strs[i].length() != strs[j].length()) {
                    continue;
                }
                else {
                    int count[] = new int[26];
                    for (int k=0; k<strs[j].length(); k++) {
                        count[strs[i].charAt(k) - 'a']++;
                        count[strs[j].charAt(k) - 'a']--;
                    }

                    // ADDED: only add strs[j] once, after confirming all counts are zero
                    int checked = 0;
                    for (int val : count) {
                        if (val != 0) {
                            break;
                        }
                        checked++;
                        if (checked == 26) {
                            list.add(strs[j]);
                            used[j] = true;
                        }
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}
