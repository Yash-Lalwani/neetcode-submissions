class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[k];

        // inserting elements inside hashmap
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int j=0; j<k; j++) {
            int max = 0;
            int rmv = 0;
            for (Integer key : hm.keySet()) {
                if (hm.get(key) > max) {
                    max = hm.get(key);
                    rmv = key;
                }
            }
            ans[j] = rmv;
            hm.remove(rmv);
        }
        return ans;
    }
}

// hashmap has 1->1, 2->2, 3->3
