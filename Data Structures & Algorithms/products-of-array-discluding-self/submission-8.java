class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        int product = 1;
        int zeroCount = 0;
        for (int i=0; i<nums.length; i++) {
            prod = prod * nums[i];
            if (nums[i] != 0) {
                product = product * nums[i];
            }
            else if (nums[i] == 0){
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length]; 
        }

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = product;
            }
            else {
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
