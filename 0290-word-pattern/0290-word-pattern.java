class Solution {
    public boolean wordPattern(String pattern, String s){
        String strs[] = s.split(" ");
        if(pattern.length()!=strs.length) return false;

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revMap = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = strs[i];
            
            if(map.containsKey(ch) && !map.get(ch).equals(word)){
                return false;
            }
            if(revMap.containsKey(word) && !revMap.get(word).equals(ch)){
                return false;  
            }
            map.put(ch,word);
            revMap.put(word,ch);
        }
        return true;
    }
}