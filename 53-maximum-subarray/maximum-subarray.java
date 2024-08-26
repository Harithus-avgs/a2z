class Solution {
    public int maxSubArray(int[] nums) {
    int n=nums.length; 
        int curr_pref_sum = 0;
    int max_subarr_sum =(int) -1e9;
    int min_pref_sum = 0;
   for(int  i=0;i<n;i++){
       curr_pref_sum+=nums[i];
       int max_subarr_sum_at_index = curr_pref_sum - min_pref_sum;
       if(max_subarr_sum_at_index>max_subarr_sum){
           max_subarr_sum = max_subarr_sum_at_index;
       }
       if(curr_pref_sum<min_pref_sum){
           min_pref_sum=curr_pref_sum;
       }
   }
        return max_subarr_sum;
    }
}