/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int peakIndex(MountainArray arr){
        int len = arr.length();
        int left = 0;
        int right = len - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr.get(mid) < arr.get(mid + 1)){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public int ascendingBinary(MountainArray arr, int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l) / 2;
            int x = arr.get(mid);
            if(x == target){
                return mid;
            }
            else if(x < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public int decendingBinary(MountainArray arr, int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l) / 2;
            int x = arr.get(mid);
            if(x == target){
                return mid;
            }
            else if(x < target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = peakIndex(arr);
        int ans = ascendingBinary(arr, target, 0, peak);
        if(ans != -1){
            return ans;
        }
        return decendingBinary(arr, target, peak + 1, arr.length() - 1);
    }
}