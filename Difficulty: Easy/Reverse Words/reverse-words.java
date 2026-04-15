class Solution {
    public String reverseWords(String s) {
        // Code here
        String words[]=s.split("\\.");
        String rev="";
        
        
        for(int i = words.length - 1; i >= 0; i--){
            
            if(words[i].equals("")) continue;
            
            if(rev.length() == 0)
                rev += words[i];
            else
                rev += "." + words[i];
        }
        return rev;
    }
}
