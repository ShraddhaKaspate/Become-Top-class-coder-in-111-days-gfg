// User function Template for Java
class Solution {
    int countWords(String s) {
        // code here
        /*
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                cnt++;
            }
        }

        return cnt + 1;
        */
        s = s.replace("\\n", " ").replace("\\t"," ")
             .replace("\\r"," "); 
        String words[] = s.trim().split("\\s+");
        return words.length;
     }
}