class Solution {
    public void sortColors(int[] nums) {
        int j = 0, i = 0, n = nums.length - 1;
        while (i <= n) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
                n--;
                i--;
            }
            i++;
        }
    }
}
