class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        /*
        int pref[]=new int[arr.length];
        pref[0] = arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
            
            if(pref[i]>max){
                max=pref[i];
            }
        }
        
        return max;
        */
        
        int maxsum=Integer.MIN_VALUE;
        int curr=Integer.MIN_VALUE;
        
        maxsum=arr[0];
        curr=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            curr=Math.max(arr[i],curr+arr[i]);
            maxsum=Math.max(maxsum,curr);
            
        }
        return maxsum;
    }
}
