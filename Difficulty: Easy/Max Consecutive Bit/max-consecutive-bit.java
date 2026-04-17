class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max=1;
        int cnt=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                cnt++;
            }else{
                cnt=1;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}
