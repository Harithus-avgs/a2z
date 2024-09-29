class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
        List<Integer> temp0 = new ArrayList<>();
        temp0.add(arr[i]);
        temp0.add(arr[i+1]);
        temp.add(temp0);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<temp.size();i++){
            int diff = Math.abs(temp.get(i).get(0) - temp.get(i).get(1));
            if(diff<min){
                min = diff;
            }
        }
        for(int i=0;i<temp.size();i++){
            int diff1 = Math.abs(temp.get(i).get(0) - temp.get(i).get(1));
            if(diff1 == min){
             List<Integer> temp1 = new ArrayList<>();  
             temp1.add(temp.get(i).get(0));
             temp1.add(temp.get(i).get(1));
             ans.add(temp1);
            }
        }
        return ans;
    }
}