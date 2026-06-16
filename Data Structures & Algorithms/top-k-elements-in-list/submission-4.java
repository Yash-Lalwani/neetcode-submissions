class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int res[] = new int[k];
        for (int i=0; i<nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (int i=0; i<k; i++) {
            int largest = 0;
            int remove = -1;
            for (Integer num : hm.keySet()) {
                if (hm.get(num) > largest) {
                    largest = hm.get(num);
                    remove = num;
                }
            }
            res[i] = remove;
            hm.remove(remove);
        }
        return res;
    }
}
