class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n=arr.length;
        int pref[]=new int[n];
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
            
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(pref[i]-k)){
                cnt+=map.get(pref[i]-k);
            }
            map.put(pref[i],map.getOrDefault(pref[i],0)+1);
        }
        return cnt;
    }
}