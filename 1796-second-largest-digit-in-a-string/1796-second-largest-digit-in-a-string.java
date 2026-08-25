class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i) - '0';
                if(num > max){
                    second = max;
                    max = s.charAt(i) - '0';
                }
                else if(num > second && num != max){
                    second = num;
                }
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}