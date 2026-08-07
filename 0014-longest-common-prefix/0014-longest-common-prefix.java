class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        String res = "";
        for(int k=1;k<strs.length;k++){
            String curr = strs[k];
            int i=0;
            while(i<curr.length() && i<prefix.length()){
                if(curr.charAt(i)==prefix.charAt(i)){
                    res+=curr.charAt(i);
                }else{
                    break;
                }
                i++;
            }
            prefix = res;
            res="";
        }
        return prefix;
    }
}