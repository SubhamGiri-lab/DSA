class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!map.containsKey(nums[i])){
                if(map.containsKey(nums[i] + k)){
                    count++;
                }
                if(map.containsKey(nums[i] - k)){
                    count++;
                }
                map.put(nums[i], 1);
            }else if(k == 0){
                if(map.get(nums[i]) == 1){
                    count++;
                    map.put(nums[i], 2);
                }
            }
        }
        return count;
    }
}