// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr,0,arr.length/2);
        Arrays.sort(arr,arr.length/2,arr.length);
        
        for(int i=0;i<arr.length/2;i++){
            list.add(arr[i]);
        }
        
        for(int i=arr.length-1;i>=arr.length/2;i--){
            list.add(arr[i]);
        }
        return list;
    }
}