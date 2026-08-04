class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){  //Character.isLetterOrDigit(ch)
                newStr.append(ch);
            }
        }
        int i=0;
        int j=newStr.length()-1;
        while(i<j){
            if(newStr.charAt(i)!=newStr.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}