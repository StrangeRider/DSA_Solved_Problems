class Solution {
    public double findPower(double x,long N){
        if(N==0) return 1;
        double halfPower = findPower(x,N/2);
        if(N%2==0){
            return halfPower*halfPower;
        }else{
            return halfPower*halfPower*x;
        }
    }
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
            N = -N;
            x = 1/x;
        }
        return findPower(x,N);
    }
}