class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int i=1;i<=arr.length;i++){
            list.add(map.getOrDefault(i, 0));
        }
        return list;
    }
}
