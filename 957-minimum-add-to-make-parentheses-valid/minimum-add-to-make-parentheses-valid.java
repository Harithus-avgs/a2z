class Solution {
    public int minAddToMakeValid(String s) {
      Stack<Character> st = new Stack<>();
      int open=0;
      int cnt=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            open++;
        }
        else{
            if(open>0){
            open--;
            }
            else{
                cnt++;
            }
        }
      }
      if(open<0){
        open=-open;
      }
      return open+cnt;  
    }
}