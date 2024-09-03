class Solution {
    public int removeDuplicates(int[] nums) {
       List<Integer> list = new ArrayList<>(); 
       int cnt=0;
       for(int i=0;i<nums.length;i++){
        if(list.contains(nums[i])){
            continue;
        }
        else{
            list.add(nums[i]);
            cnt++;
        }
       }
        for(int i=0;i<cnt;i++){
            nums[i]=list.get(i);
        }
        return cnt;
    }
}