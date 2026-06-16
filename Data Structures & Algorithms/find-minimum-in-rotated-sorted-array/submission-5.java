class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int last = nums[end];

        if (end == 0) {
            return nums[end];
        }

        else if (nums[0] < nums[end] && nums[0] < nums[1]) {
            return nums[0];
        }

        else if (nums[end] < nums[0] && nums[end] < nums[end-1]) {
            return nums[end];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1]) {
                return nums[mid];
            }

            else {
                if (nums[mid] > last) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}