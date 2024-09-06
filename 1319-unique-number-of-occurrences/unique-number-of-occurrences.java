class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int element :arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        for (int count : map.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        return true;
        
    }
}