class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        long sum = 0;
        int revDig = 0;
        long newDig = 0;
        while(temp>0){
            int ld = temp%10;
            if(ld!=0){
                sum += ld;
                revDig = revDig*10 + ld;
            }
            temp/=10;
        }
        while(revDig>0){
            int ld = revDig%10;
            newDig = newDig*10 + ld;
            revDig /= 10;
        }

        return sum*newDig;
    }
}