// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum*10+rem;
        }
       
            return sum;
    }
}