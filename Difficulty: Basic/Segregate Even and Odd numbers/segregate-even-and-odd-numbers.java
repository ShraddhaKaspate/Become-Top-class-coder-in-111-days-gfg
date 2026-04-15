class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
    
        Arrays.sort(arr);
        
        int ans[]=new int[arr.length];
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                ans[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
}