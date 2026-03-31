class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                list.add(arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=1;i<=arr.length;i++){
            if(!map.containsKey(i)){
                list.add(i);
                break;
            }
            
        }
        return list;
    }
}
