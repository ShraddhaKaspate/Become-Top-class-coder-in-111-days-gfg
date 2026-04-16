class Solution {
    public boolean isValid(String s) {
        // code here
        String words[]=s.split("\\.");
        if(words.length!=4)
            return false;
            
        for(String ch : words)
        {
            if(ch.length()==0 || ch.length()>3){
                return false;
            }
            
            if(ch.length()>1 && ch.charAt(0)=='0') return false;
            
            for(char c: ch.toCharArray()){
            if(!Character.isDigit(c)) return false;
            }
            
            int no=Integer.parseInt(ch);
            if(no<0 || no>255){
                return false;
            }
        }
        return true;
    }
}