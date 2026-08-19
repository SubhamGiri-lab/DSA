class Solution {
    private void generate(int[] nums, List<Integer> ans, List<List<Integer>> list) {
        if (ans.size() == nums.length) {
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                continue;
            }
            ans.add(nums[i]);
            generate(nums, ans, list);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        generate(nums, ans, list);
        return list;
    }
}