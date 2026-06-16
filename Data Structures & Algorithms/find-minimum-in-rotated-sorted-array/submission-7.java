class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int res = nums[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            res = Math.min(res, nums[mid]);

            if (nums[mid] > nums[end]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return res;
    }
}


// if mid > last then min lies in right
// if mid < last, then min lies in left