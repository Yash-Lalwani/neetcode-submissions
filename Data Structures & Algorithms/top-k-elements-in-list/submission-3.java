class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for (int i=0; i<k; i++) {
            int largest = Integer.MIN_VALUE;
            int value = 0;
            for (Integer val : hm.keySet()) {
                if (hm.get(val) > largest) {
                    largest = hm.get(val);
                    value = val;
                }
            }
            list.add(value);
            hm.remove(value);
        }

        int[] ans = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

    }
}
