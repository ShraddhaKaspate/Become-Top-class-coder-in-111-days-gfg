class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
            for(int start=0;start<arr.length;start+=k){
                
              int i=start;
              int j=Math.min(i+k-1,n-1);
              
              while(i<j){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  
                  i++;
                  j--;
                  
              }
                
            }
        
    }
}