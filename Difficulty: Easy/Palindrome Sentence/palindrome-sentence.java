class Solution {
    public boolean isPalinSent(String s) {
        // code here
        String oldstr=s.toLowerCase();
        String str=oldstr.trim();
       StringBuilder ans = new StringBuilder();
        char[] string = str.toCharArray();
        
        for(char ele : string){
            if(Character.isLetterOrDigit(ele)){
                ans.append(ele);
            }
        }
        int i=0;
        int j=ans.length()-1;
        
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}