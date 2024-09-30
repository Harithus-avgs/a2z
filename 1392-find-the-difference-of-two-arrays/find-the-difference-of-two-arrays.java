class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       HashSet<Integer> list1= new HashSet<>();
       HashSet<Integer> list2= new HashSet<>();
       for(int val:nums1){
        list1.add(val);
       }
       for(int val:nums2){
        list2.add(val);
       }
       HashSet<Integer> ans1 = new HashSet<>();
       for(int val:nums1){
        if(list2.contains(val)==false)
        ans1.add(val);
       }
        HashSet<Integer> ans2 = new HashSet<>();
       for(int val:nums2){
        if(list1.contains(val)==false)
        ans2.add(val);
       }
       return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));

       
    }
}