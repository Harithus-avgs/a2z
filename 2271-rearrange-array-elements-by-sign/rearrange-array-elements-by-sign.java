class Solution {
    public int[] rearrangeArray(int[] nums) {
       int pos=0;
       int neg=1;

        int[] nums1 = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
        }

       for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            nums1[neg] = nums[i];
            neg+=2;
        }
        else{
            nums1[pos] = nums[i];
            pos+=2;
        }
       }

        for(int i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }

       return nums;
    }
}