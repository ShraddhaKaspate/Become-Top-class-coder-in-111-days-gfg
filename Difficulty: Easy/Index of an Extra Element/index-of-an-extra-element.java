/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int ind=-1;
        int start=0,end=b.length-1;
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            if(a[mid]==b[mid]){
                start=mid+1;
            }else{
                ind=mid;
                end=mid-1;
            }
        }
     if(ind==-1){
         return a.length-1;
     }else{
         return ind;
     }   
    }
}