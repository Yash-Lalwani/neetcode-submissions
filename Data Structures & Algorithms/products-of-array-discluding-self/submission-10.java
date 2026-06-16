class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int product = 1;
        int zCount = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                zCount++;
                continue;
            }
            product *= nums[i];
        }

        if (zCount > 1) {
            return res;
        }

        for (int i=0; i<res.length; i++) {
            if (nums[i] == 0) {
                res[i] = product;
            }
            else if (zCount == 1){
                res[i] = 0;
            }
            else {
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}  
