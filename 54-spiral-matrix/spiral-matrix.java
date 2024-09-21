class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
        while(startRow <= endRow && startCol <= endCol){

            for(int j=startCol ; j<=endCol ; j++){
                ans.add(matrix[startRow][j]);
            }
            for(int i=startRow+1 ; i<=endRow ; i++){
                ans.add(matrix[i][endCol]);
            }
            for(int j=endCol-1 ; j>=startCol ; j--){
                if(startRow==endRow){
                    break;
                }
                ans.add(matrix[endRow][j]);
            }
            for(int i=endRow-1 ; i>startRow ; i--){
                if(startCol==endCol){
                    break;
                }
                ans.add(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return ans;
    }
}