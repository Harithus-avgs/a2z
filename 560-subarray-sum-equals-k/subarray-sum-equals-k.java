class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int presum=0; int ans=0;
     
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
     
        for(int i=0;i<n;i++){
            presum+=nums[i];
            ans+=hm.getOrDefault(presum-k,0);
            hm.put(presum,hm.getOrDefault(presum,0)+1);
           
        }
        return ans;
    }
}