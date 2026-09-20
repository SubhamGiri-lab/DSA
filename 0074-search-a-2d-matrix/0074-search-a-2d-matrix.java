class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int x = n*m;
        int l = 0;
        int r = x - 1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int ridx = mid/m;
            int cidx = mid%m;
            if(mat[ridx][cidx] == target){
                return true;
            }else if(target < mat[ridx][cidx]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
}