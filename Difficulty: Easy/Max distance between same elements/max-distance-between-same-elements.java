class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else{
                int dist=i-map.get(arr[i]);
                max=Math.max(max,dist);
            }
        }
        return max;
    }
}