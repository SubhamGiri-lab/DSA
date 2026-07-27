class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int num: nums){
            max1 = Math.max(max1, Math.min(max2, num));
            max2 = Math.max(max2, num);
        }
        return (max1 - 1)*(max2 - 1);
    }
}