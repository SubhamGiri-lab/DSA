class Solution {
    public boolean isPossible(int m, int n, int mid, int k) {
        int count = 0;
        for(int i = 1; i <= m; i++){
            count += Math.min(n, mid / i);
            if(count >= k){
                return true;
            }
        }
        return false;
    }

    public int findKthNumber(int m, int n, int k) {
        int left = 1;
        int right = m * n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(m, n, mid, k)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}