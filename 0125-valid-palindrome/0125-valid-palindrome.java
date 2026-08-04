class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String newStr = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <='z' || ch>='0' && ch<='9'){  //Character.isLetterOrDigit(ch)
                newStr+=ch;
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