class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums.length==0 || nums.length==1){
         int[] arr = new int[1];
         arr[0]=-1;
         return arr;
        }
       int[] nge = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<i+nums.length;j++){
            int ind = j%nums.length;
            if(nums[ind]>nums[i]){
                nge[i]=nums[ind];
                break;
            }
            nge[i]=-1;
        }
       }
       return nge; 
    }
}