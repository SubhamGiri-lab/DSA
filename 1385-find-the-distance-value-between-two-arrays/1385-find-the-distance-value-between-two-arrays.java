class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int count = 0;
        for(int i =0; i< len1; i++){
            boolean flag = true;
            for(int j =0 ; j < len2; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                count++;
            }
        }
        return count;
    }
}