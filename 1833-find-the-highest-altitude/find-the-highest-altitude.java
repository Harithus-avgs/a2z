class Solution {
    public int largestAltitude(int[] gain) {
        int[] pre = new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            pre[i+1]=pre[i]+gain[i];
        }
        Arrays.sort(pre);
        return pre[pre.length-1];
    }
}