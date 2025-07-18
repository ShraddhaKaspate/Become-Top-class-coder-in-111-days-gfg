class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int seondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>seondmax && arr[i]<max){
                seondmax=arr[i];
            }
        }
        if(seondmax==Integer.MIN_VALUE) return -1;
        else return seondmax;
    }
}