class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        /*
        int dist=0;
        int maxdis=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    dist=j-i;
                    maxdis=Math.max(maxdis,dist);
                }
                
            }
        }
        
        return maxdis;
        */
        
        int dist=0;
        int maxdist=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                dist=i-map.get(arr[i]);
                maxdist=Math.max(maxdist,dist);
            }
            else{
                map.put(arr[i],i);
            }
        }
        return maxdist;
    }
}