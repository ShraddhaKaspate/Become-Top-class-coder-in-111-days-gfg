class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key)>Math.floor(arr.length/3)){
                list.add(key);
            }
        }
        
        Collections.sort(list);  
        return list;
    }
}