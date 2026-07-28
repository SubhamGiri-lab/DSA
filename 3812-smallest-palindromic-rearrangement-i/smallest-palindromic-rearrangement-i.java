class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        int arr[] = new int[26];
        for(int i = 0; i < n; i++){
            arr[s.charAt(i) - 'a']++;
        }
        char[] ans = new char[n];
        int left = 0;
        int right = n - 1;
        for (int i = 0; i < 26; i++) {
            while (arr[i] >= 2) {
                char ch = (char) (97 + i);
                ans[left++] = ch;
                ans[right--] = ch;
                arr[i] -= 2;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                ans[left] = (char) (97 + i);
                break;
            }
        }

        return new String(ans);
    }
}