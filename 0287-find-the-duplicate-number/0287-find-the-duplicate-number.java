class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i : nums){
            arr[i]++;
            if(arr[i] == 2){
                return i;
            }
        }
        return 0;
    }
}