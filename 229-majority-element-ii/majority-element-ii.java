class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
      }
      List<Integer> ans = new ArrayList<>();
      int maj = nums.length/3;

      for(Map.Entry<Integer,Integer> x : map.entrySet()){
        int element = x.getKey();
        int count = x.getValue();

        if(count>maj){
            ans.add(element);
        }
      }  
      return ans;
    }
}