class Solution {
    public int missingMultiple(int[] nums, int k) {
        int num = 1;
        Set<Integer> set = new HashSet<>();
        for(int nm : nums){
            set.add(nm);
        }
        int ans = 0;
        for(int i = 0; i < 101; i++){
            if(set.contains(k * num)){
                num++;
            }else{
                ans = k * num;
            }
        }
        return ans;
    }
}