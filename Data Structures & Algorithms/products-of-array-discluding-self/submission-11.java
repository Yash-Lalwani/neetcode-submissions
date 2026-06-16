class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] prefix = new int[len];
        prefix[0] = 1;

        int[] suffix = new int[len];
        suffix[len-1] = 1;

        int res[] = new int[len];

        for (int i=1; i<len; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[len-1-i] = suffix[len-1-(i-1)] * nums[len-(i-1)-1];
        }

        for (int i=0; i<len; i++) {
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }
}  
