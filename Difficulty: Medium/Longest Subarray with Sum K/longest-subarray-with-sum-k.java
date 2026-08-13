class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefsum[]=new int[arr.length];
        int maxsum=0;
        prefsum[0]=arr[0];
        
        for(int i=1;i<arr.length;i++){
            prefsum[i]=prefsum[i-1]+arr[i];
        }
        
        map.put(0,-1);
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(prefsum[i]-k)){
                
                int length = i - map.get(prefsum[i] - k);
                maxsum=Math.max(maxsum,length);
                
            }
            
             if(!map.containsKey(prefsum[i])) {
                map.put(prefsum[i], i);
            }
        }
        return maxsum;
    }
    
}
