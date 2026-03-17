class Solution {
    int thirdLargest(int arr[]) {
        // code here
      /*  HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        
        ArrayList<Integer> list=new ArrayList<>();
       for(int num : set){
            list.add(num);
        }
        Collections.sort(list);
        
        
        
        if(list.size() < 3){
             return -1; 
        }
        
        return list.get(list.size()-3);
        
        */
        Arrays.sort(arr);
        if(arr.length<3){
            return -1;
        }
        
        return arr[arr.length-3];
    }
}