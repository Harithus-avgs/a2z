class Solution {
    public int getLucky(String s, int k) {
       String sum ="";
       for(int i=0;i<s.length();i++){
        sum+=s.charAt(i) - 96;
       }
       System.out.println(sum);
       int sum1=0;
       for(int i=0;i<sum.length();i++){
        sum1+=Integer.valueOf(sum.charAt(i)-48);
       } 
       System.out.println(sum1);
        return digitsum(sum1,k-1);
    }
    public int digitsum(int n,int k){
        if(k==0){
            return (int)n;
        }
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        k--;
        return digitsum(sum,k);
    }
}