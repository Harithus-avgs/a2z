class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int ans = chalk(chalk,k);
        return ans;
    }
    public int chalk(int[] chalk,int k){
     int sum =0;
     for(int i=0;i<chalk.length;i++){
        sum+=chalk[i];
        if(k-sum<0){
            return i;
        }
     }
     return chalk(chalk,(int) k%sum);

        
    }
}