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
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0){
                for(int j = 0; j < arr[i]; j++){
                    char ch = (char)(i + 97);
                    sb.append(ch);
                }
            }
        }
        StringBuilder ans = new StringBuilder(sb);

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < 26; i++) {
            while (arr[i] >= 2) {
                char ch = (char) (97 + i);
                ans.setCharAt(left++, ch);
                ans.setCharAt(right--, ch);
                arr[i] -= 2;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                ans.setCharAt(left, (char) (97 + i));
                break;
            }
        }

        return ans.toString();
    }
}