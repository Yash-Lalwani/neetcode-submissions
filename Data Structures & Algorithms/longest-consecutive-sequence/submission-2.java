class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> seen = new HashSet<>();
        int large = 0;
        for (int i=0; i<nums.length; i++) {
            seen.add(nums[i]);
        }

        for (Integer key : seen) {
            int count = 0;
            while (seen.contains(key+1)) {
                count++;
                key = key+1;
            }
            if (count > large) {
                large = count;
            }
        }
        return large + 1;
    }
}
