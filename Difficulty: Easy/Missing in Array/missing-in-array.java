class Solution {
    int missingNum(int arr[]) {
        // code 
        /*
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        
        return arr.length+1;
        */
        Arrays.sort(arr);
        int check=1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==check){
                check++;
            }else{
                return check;
            }
        }
        return arr.length+1;
    }
}