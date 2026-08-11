class Solution {
    public int missingInteger(int[] nums) {
        int prefix = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1] + 1){
                break;
            }
            prefix += nums[i];
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int res = prefix;
        while(set.contains(res)){
            res++;
        }
        return res;
    }
}