class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revMap = new HashMap<>();
        String strs[] = s.split(" ");

        if(pattern.length()!=strs.length) return false;

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = strs[i];
            
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)) return false;
            }else{
                if(revMap.containsKey(word)) return false;
                
                map.put(ch,word);
                revMap.put(word,ch);
            }
        }
        return true;
    }
}