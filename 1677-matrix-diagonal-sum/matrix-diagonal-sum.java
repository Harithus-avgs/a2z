class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if(i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
}