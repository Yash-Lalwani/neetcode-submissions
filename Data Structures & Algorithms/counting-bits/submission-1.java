class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for (int i=1; i<=n; i++) {
            int index = i;
            int res = 0;
           while (index!=0) {
            index = index & index-1;
            res++;
           }
           arr[i] = res;
        }
        return arr;
    }
}
