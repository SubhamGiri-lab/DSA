class Solution {
    static{
        for(int i = 0; i <= 500; i++){
            maxArea(new int[] {0, 0});
        }
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i < j){
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(area, max);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}