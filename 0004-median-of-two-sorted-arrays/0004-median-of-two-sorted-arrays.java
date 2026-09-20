class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<n) arr[k++]=nums1[i++];
        while(j<m) arr[k++]=nums2[j++];
        int len =m+n;
        if(len%2!=0){
            return arr[len/2];
        }else{
            return (arr[len/2]+arr[(len/2)-1])/2.0;
        }
        // for(int i=0;i<nums1.length;i++){
        //     arr[i]=nums1[i];
        // }
        // int len=n+m;
        // for(int i=nums1.length;i<len;i++){
        //     arr[i]=nums1[i];
        // }
        // float sum=0;
        // for(int i=0;i<nums1.length;i++){
        //     sum+=nums1[i];
        // }
        // for(int i=0;i<nums2.length;i++){
        //     sum+=nums2[i];
        // }
        // float res = sum/(m+n);
        // return res;
    }
}