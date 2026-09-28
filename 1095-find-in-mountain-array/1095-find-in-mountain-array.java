/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int peakIdx(MountainArray mount){
        int left = 0;
        int right = mount.length() - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mount.get(mid) < mount.get(mid + 1)){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        } 
        return left;
    }
    public int ascending(MountainArray mount, int target, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mount.get(mid) == target){
                return mid;
            }else if(mount.get(mid) < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public int decending(MountainArray mount, int target, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mount.get(mid) == target){
                return mid;
            }else if(mount.get(mid) > target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mount) {
        int x = peakIdx(mount);
        int res = ascending(mount, target, 0, x);
        if(res == -1){
            return decending(mount, target, x + 1, mount.length() - 1);
        }
        return res;
    }
}