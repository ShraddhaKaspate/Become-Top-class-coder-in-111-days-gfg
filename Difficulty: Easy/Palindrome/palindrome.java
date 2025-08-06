class Solution {
    public boolean isPalindrome(int n) {
        // code here
    int temp=n;
    int r=0,sum=0;
    while(n>0){
        r=n%10;
        n=n/10;
        sum=sum*10+r;
    }
    if(sum==temp){
        return true;
    }else
        return false;
    }
}