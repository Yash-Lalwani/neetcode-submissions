class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int j = 1;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] + numbers[j] == target) {
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }
            else if (numbers[i] + numbers[j] < target && j<numbers.length-1) {
                j++;
                i--;
            }
            else {
                j = i+2;
            }
        }
        return arr;
    }
}
