class Solution {
    public boolean isPowerOfFour(int n) {
       if(n==1) return true;
       
       return isPower(1l,n);
    }
    boolean isPower(long n,int target){
        if(n>target) return false;
        n=n*4;
        if(n==target){
            return true;
        }
        return isPower(n,target);
    }
}