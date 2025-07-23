class Solution {
    int majorityElement(int arr[]) {
        // code here
        //ArrayList<Integer,Integer>list=new ArrayList<>()
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            
            if(entry.getValue()>(arr.length/2)){
                return entry.getKey();
            }
        }
        return -1;
    }
}