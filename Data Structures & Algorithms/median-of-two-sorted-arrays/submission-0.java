class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        int j = 0;
        for (int i=0; i<n; i++) {
            arr[j] = nums1[i];
            j++;
        }
        for (int i=0; i<m; i++) {
            arr[j] = nums2[i];
            j++;
        }
        Arrays.sort(arr);
        double res = 0;
        if ((n+m)%2 != 0) {
            res = arr[(n+m)/2];
        }
        else {
            res = (double)(arr[(n+m)/2] + arr[(n+m)/2-1])/2;
            
        }
        return res;
    }
}
