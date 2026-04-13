class Solution {
    public ArrayList<Integer> uniqueId(int[] arr) {
        //  code here
        
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int n: set){
            list.add(n);
        }
        return list;
    }
}