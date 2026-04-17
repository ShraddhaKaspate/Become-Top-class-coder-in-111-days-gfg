class Solution {
    boolean isPalindrome(String s) {
        // code here
        /*
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(!s.equals(rev)) return false;
        
        return true;
        */
        
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            rev.append(s.charAt(i));
        }
        
        return s.equals(rev.toString());
    }
}