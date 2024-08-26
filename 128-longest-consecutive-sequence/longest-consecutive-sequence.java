class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       Arrays.sort(nums);
       int maxlength = 1;
       int length = 1;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            continue;
        }
        else if(nums[i+1]-nums[i] == 1){
            length++;
        }
        else{
            if(length > maxlength){
                maxlength = length;
            }
            length = 1;
        }
       }
       if(length > maxlength){
                maxlength = length;
            }
       return maxlength; 
    }
}