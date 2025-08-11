// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int []largest={-1,-1};
        int largestlen=0;
        int pref[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(map.containsKey(pref[i]-k)){
                int len=i-map.get(pref[i]-k);
                if(len>=largestlen){
                    largestlen=len;
                    largest[0]=map.get(pref[i]-k)+1;
                    largest[1]=i;
                }
            }
            if(!map.containsKey(pref[i])){
                map.put(pref[i],i);
            }
            //System.out.print(largestlen);
        }
        return largestlen;
        
        }
}
