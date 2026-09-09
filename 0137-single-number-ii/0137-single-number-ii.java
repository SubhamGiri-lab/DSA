class Solution {
    public int singleNumber(int[] nums) {
        int once = 0, thrice = 0;
        for(int num : nums){
            once = (once ^ num) & ~thrice;
            thrice = (thrice ^ num) & ~once;
        }
        return once;
    }
}