class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        HashSet<Integer> rightset=new HashSet<>();
        HashSet<Integer> leftset=new HashSet<>();
        ArrayList<Integer> anslist=new ArrayList<>();
        int[] distele=new int[N];
        
        for(int i=N-1;i>=0;i--){
          
              distele[i] = rightset.size(); 
              rightset.add(A[i]);           
            }
        
        
       for(int i=0;i<N;i++) {
           int diff=leftset.size()-distele[i];
          
           anslist.add(diff);
            leftset.add(A[i]);
       }
       return anslist;
    }
}
