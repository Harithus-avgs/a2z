class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
      }
      List<Integer> ans = new ArrayList<>();
      int maj = nums.length/3;
      
      Set<Integer> keySet = map.keySet();
      for(Integer key: keySet){
        if(map.get(key)>maj){
            ans.add(key);
        }
      }  
      return ans;
    }
}