class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            if(i < num.length() / 2){
                if(ch == '?'){
                    leftQ++;
                }else{
                    leftSum += ch - '0';
                }
            }else{
                if(ch == '?'){
                    rightQ++;
                }else{
                    rightSum += ch - '0';
                }
            }
        }
        if((rightQ + leftQ) % 2 != 0){
            return true;
        }
        return 2 * (leftSum - rightSum) != 9 * (rightQ - leftQ);
    }
}