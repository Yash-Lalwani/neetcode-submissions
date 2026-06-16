class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        for (int i=0; i<nums.length; i++) {
            int max = 0;
            int j = 1;
            while (j<=n) {
                if (nums[max] < nums[j]) {
                    max = j;
                }
                j++;
            }
            int temp = nums[max];
            nums[max] = nums[n];
            nums[n] = temp;
            n--;
        }
        return nums;
    }
}