class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length-1;
        for (int i=0; i<=n; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
                n--;
                i--;
            }
        }
        return n+1;
    }
}