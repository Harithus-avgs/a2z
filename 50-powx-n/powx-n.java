class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                x = 1 / x;
                return myPow(x * x, n / 2);
            }
            return myPow(1 / x, -n);
        }
        if(n==0){
            return 1;
        }
        double halfpow = myPow(x,n/2);
        if(n%2==0) return halfpow*halfpow;
        else return x*halfpow*halfpow;
    }
}