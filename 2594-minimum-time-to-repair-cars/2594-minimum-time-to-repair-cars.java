class Solution {
    public boolean isPossible(int[] arr, long mid, int cars){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.sqrt(mid/arr[i]);
        }
        return sum >= (long)cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long max = Long.MIN_VALUE;
        for(int rank : ranks){
            max = Math.max(max, rank);
        }
        long right = max * cars * cars;
        long ans = 0;
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(isPossible(ranks, mid, cars)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}