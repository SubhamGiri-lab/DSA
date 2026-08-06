class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);

        int left = 1;
        int right = arr[arr.length - 1] - arr[0];
        int ans = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlace(arr, mid, m)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean canPlace(int[] arr, int mid, int m) {
        int count = 1;
        int lastPos = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                count++;
                lastPos = arr[i];
            }
            if (count >= m) {
                return true;
            }
        }

        return count >= m;
    }
}