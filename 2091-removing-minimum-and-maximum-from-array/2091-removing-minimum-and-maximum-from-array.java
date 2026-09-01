class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE, minIdx = 0;
        int max = Integer.MIN_VALUE, maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
            if (nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
        }
        int a = Math.max(maxIdx, minIdx) + 1;
        int b = nums.length - Math.min(maxIdx, minIdx);
        int c = (Math.min(minIdx, maxIdx) + 1) + (nums.length - Math.max(minIdx, maxIdx));
        return Math.min(a, Math.min(b, c));
    }
}