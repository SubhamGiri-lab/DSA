class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverse = new HashMap<>();

        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }else{
                if(reverse.containsKey(word)){
                    return false;
                }
                map.put(ch, word);
                reverse.put(word, ch);
            }
        }
        return true;
    }
}