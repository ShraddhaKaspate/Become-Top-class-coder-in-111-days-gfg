class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
     /* 
     HashSet<Integer> set=new HashSet<>();
     int ans=0;
        
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        if(set.size()==1){
            return -1;
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

         ans=list.get(list.size()-2);
         return ans;
         */
         
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax  && arr[i]<max){
                secmax=arr[i];
            }
        }
        
        if(secmax == Integer.MIN_VALUE){
                return -1;
        }
        
        return secmax;
       
    }
}