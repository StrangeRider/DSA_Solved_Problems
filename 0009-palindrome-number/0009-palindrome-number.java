class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans=0;
        int org=x;
        while(x!=0){
            ans=(ans * 10)+(x % 10);
            x = x/10;
        }
        if(org==ans){
            return true;
        }
        return false;
    }
}