class Solution {
    public boolean isAnagram(String s, String t) {
       int[] count = new int[26];

       for(int i=0;i<s.length();i++){
       char x = s.charAt(i);
        count[x - 'a']++;
       }
       for(int i=0;i<t.length();i++){
       char x = t.charAt(i);
        count[x - 'a']--;
       }

        for(int i=0;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
}