class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxCount = 1;
        int i = 0;
        int n = nums.length;
        int j = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        int count = 1;
        while(j < n){
            int num = nums[j];
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > k) {
                while (map.get(num) > k) {
                    map.put(nums[i], map.get(nums[i]) - 1);
                    i++;
                    count--;
                }
                count++;
                j++;
            } else {
                count++;
                j++;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}