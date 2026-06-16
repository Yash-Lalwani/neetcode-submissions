class Solution {
    public int majorityElement(int[] nums) {
        int me = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i],0) + 1);
            if (hm.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return me;

        // for (int key : hm.keySet()) {
        //     if (hm.get(key) >= (nums.length/2) + 1) {
        //         me = key;
        //     }
        // }
        // return me;
    }
}