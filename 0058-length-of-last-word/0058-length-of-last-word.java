class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i=s.length()-1;
        int count = 0;
        while(s.charAt(i)!=' ' && i!=0){
            i--;
            count++;
        }
        if(i==0){
            count++;
        }
        return count;
    }
}