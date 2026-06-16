class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int nums[], int si, int ei) {
        if (si >= ei) return;

        int pIdx = partition(nums, si, ei);
        quickSort(nums, si, pIdx - 1);
        quickSort(nums, pIdx + 1, ei);
    }

    public int partition(int nums[], int si, int ei) {
        int pivot = nums[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (nums[j] <= pivot) { // ✅ use <= for stability
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;
        int temp = nums[i];
        nums[i] = nums[ei];
        nums[ei] = temp;

        return i;
    }
}
