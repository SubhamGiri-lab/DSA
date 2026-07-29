class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        boolean isUpper = false;
        for(char ch: word.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
                isUpper = true;
            }
        }
        if(isUpper){
            if((count == 1) && Character.isUpperCase(word.charAt(0))){
                return true;
            }else if(count == word.length()){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}