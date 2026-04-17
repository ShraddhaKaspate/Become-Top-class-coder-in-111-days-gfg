class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int repeat = 0, missing = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                repeat = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        
        for(int i = 1; i <= arr.length; i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
        
        ans.add(repeat);
        ans.add(missing);
        return ans;
    }
}
