class Solution {
    public char repeatedCharacter(String s) {
        int[] frq = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (frq[ch - 'a'] > 0) {
                return ch;
            }
            frq[ch - 'a']++;
        } 
        return ' ';
    }
}