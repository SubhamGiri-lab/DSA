class Solution {
    public boolean isPossible(int[] arr, int mid, double h){
        double total = 0;
        for(int i = 0; i < arr.length - 1; i++){
            total += Math.ceil((double)arr[i]/mid);
        }
        total += (double)arr[arr.length - 1]/mid;
        return total <= h;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour <= dist.length - 1){
            return -1;
        }
        int left = 1;
        int right = 10000000;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(dist, mid, hour)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}