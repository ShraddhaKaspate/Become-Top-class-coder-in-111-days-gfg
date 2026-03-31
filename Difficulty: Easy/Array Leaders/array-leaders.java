class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        int largest=arr[arr.length-1];
        list.add(largest);
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=largest){
                largest=arr[i];
                list.add(largest);
            }
        }
        
        Collections.reverse(list);
        return list;
        
    }
}
