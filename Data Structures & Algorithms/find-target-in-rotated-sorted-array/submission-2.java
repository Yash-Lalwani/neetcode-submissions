class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (nums[mid] == target) {
                return mid;
            }
            
            // means right part is sorted and target lies in right part
            else if (nums[mid] < nums[end] && target < nums[end] && target > nums[mid]) {
                start = mid + 1;
            }

            // right part is sorted and target lies in left part
            else if (nums[mid] < nums[end] && target > nums[end]) {
                end = mid - 1;
            }

            else if (nums[mid] < nums[end] && target < nums[mid]) {
                end = mid - 1;
            }

            // left part is sorted and target lies in
            else if (nums[mid] > nums[end] && target < nums[mid] && target >= nums[start]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
