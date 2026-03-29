/*
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        
       for(int x : set){
            list.add(x);
        }
        
        return list;
    }
}
*/


class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length == 0) return list;
        
        list.add(arr[0]);   
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}