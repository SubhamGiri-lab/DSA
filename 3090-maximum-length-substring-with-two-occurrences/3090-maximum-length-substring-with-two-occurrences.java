class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0;
        int j = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        int count = 0;
        while(j < n){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            count++;
            while(map.get(ch) > 2){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++; 
                count--;
            }
            maxCount = Math.max(maxCount, count);
            j++;
        }
        return maxCount;
    }
}