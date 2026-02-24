class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        /*
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
        }
        for(int j=0;j<b.length;j++){
            if(!list.contains(b[j])){
                list.add(b[j]);
            }
        }
        return list;
        
        */
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
        }
        for(int j =0;j<b.length;j++){
            if(!set.contains(b[j])){
                set.add(b[j]);
            }
        }
        
        
        return new ArrayList<>(set);
    }
}