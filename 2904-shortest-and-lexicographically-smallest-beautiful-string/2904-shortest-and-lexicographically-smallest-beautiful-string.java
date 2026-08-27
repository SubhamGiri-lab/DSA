class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        for(int len = k; len <= n; len++){
            String ans = "";
            for(int start = 0; start <= n - len; start++){
                String temp = s.substring(start,start + len);
                int count = 0;
                for(char ch : temp.toCharArray()){
                    count += (ch == '1') ? 1 : 0;
                }
                if(count == k){
                    if(ans.isEmpty() || temp.compareTo(ans) < 0){
                        ans = temp;
                    }
                }
            }
            if(!ans.isEmpty()){
                return ans;
            }
        }
        return "";
    }
}