class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        
        /*
        ArrayList<Integer> list=new ArrayList<>();
        
        int mindiff=Integer.MAX_VALUE;
        int ans1=0,ans2=0;
        
        for(int i=0;i<arr1.length;i++){
           for(int j = arr2.length - 1; j >= 0; j--){
                
                int sum=arr1[i]+arr2[j];
                int diff=Math.abs(sum-x);
            
               if(diff<mindiff){
                   mindiff=diff;
                   ans1=arr1[i];
                   ans2=arr2[j];
               }
                
                    
            }
               
        }
             
       list.add(ans1);
       list.add(ans2);
        return list;
        */
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int mindiff=Integer.MAX_VALUE;
        int ans1=0,ans2=0;
        
        int i=0;
        int j=arr2.length-1;
        
        while(i<arr1.length && j>=0){
            
            int sum=arr1[i]+arr2[j];
            int diff=Math.abs(sum-x);
            
               if(diff<mindiff){
                   mindiff=diff;
                   ans1=arr1[i];
                   ans2=arr2[j];
               }
               
               if(sum>x){
                   j--;
               }else
               {
                   i++;
               }
        }
        
        list.add(ans1);
        list.add(ans2);
        
        return list;
    }
}