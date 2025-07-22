class Solution {
    int missingNum(int arr[]) {
        // code here
        int cnt=1;
       Arrays.sort(arr);
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==cnt){
                cnt++;
            }
        }
        return cnt;
    }
}