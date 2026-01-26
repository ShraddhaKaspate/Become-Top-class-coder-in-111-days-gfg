// User function Template for Java

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j]){
                    if(j-i<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}