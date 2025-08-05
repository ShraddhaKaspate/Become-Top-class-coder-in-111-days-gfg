// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int cnt=0;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            if(rem !=0 && n%rem==0){
                cnt++;
            }
            temp=temp/10;
        }
        return cnt;
    }
}