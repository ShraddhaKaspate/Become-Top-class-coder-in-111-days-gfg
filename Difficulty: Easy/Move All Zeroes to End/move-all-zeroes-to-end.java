class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int cnt=0;
        
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0){
               cnt++;
           }
        }
        
        int ind=0;
        for(int j=0;j<arr.length;j++)
        {
            if (arr[j] != 0) {
            arr[ind] = arr[j];
            ind++;
        }
        }
        
        while(cnt>0){
            arr[ind]=0;
            ind++;
            cnt--;
        }
        
    }
}