class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul = 1;
        int isZero = 0;
        for(int i : nums){
            if(i==0){
                isZero++;
                continue;
            }else{
                mul*=i;
            }
        }
        if(isZero<1){
            for(int i = 0 ; i < n ; i++){
                int temp = nums[i];
                nums[i] = mul/temp;
            }
        }else if(isZero==1){
            for(int i = 0; i < n ; i++){
                if(nums[i]==0){
                    nums[i]=mul;
                }else{
                    nums[i]=0;
                }
            }
        }else{
            for(int i = 0 ; i < n ; i++){
                nums[i] = 0;
            }
        }
        return nums;
    }
}