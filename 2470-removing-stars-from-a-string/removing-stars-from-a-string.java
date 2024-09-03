class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        String rev="";
        for(int i=ans.length()-1;i>=0;i--){
            rev+=ans.charAt(i);
        }
        return rev;
    }
}