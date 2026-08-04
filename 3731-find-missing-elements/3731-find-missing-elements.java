class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Set<Integer> set = new HashSet<>();
       int mn = 100;
       int mx = 0;
       for(int x: nums){
            mn = Math.min(mn, x);
            mx = Math.max(mx, x);
            set.add(x);
       }
       List<Integer> ans = new ArrayList<>();
       for(int i = mn + 1; i < mx; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
       }
       return ans;
    }
}