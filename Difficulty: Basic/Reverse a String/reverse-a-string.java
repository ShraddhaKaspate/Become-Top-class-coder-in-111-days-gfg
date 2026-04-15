// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        /*
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
        */
        
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
        String rev=new String(arr);
        return rev;
    }
}