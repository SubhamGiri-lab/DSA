class Solution {
    public boolean isPossible(int[] q, int mid, int n){
        int sum = 0;
        for(int i = 0; i < q.length; i++){
            sum += (q[i] + mid - 1) / mid;
            if(sum > n){
                return false;
            }
        }
        return sum <= n;
    }
    public int minimizedMaximum(int n, int[] q) {
        int left = 1;
        int right = 0;
        for(int qa : q){
            right = Math.max(right, qa);
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(q, mid, n)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}