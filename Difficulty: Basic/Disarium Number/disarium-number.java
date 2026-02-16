// User function Template for Java

class Solution {
    static int isDisarium(int N) {
        // code here
      int temp=N;  
      int sum=0;
      int digit=0;
      while(temp>0){
          temp=temp/10;
          digit++;
      }
      temp=N;
      for(int i=digit;i>0;i--){
          
          while(temp > 0){
    int rem = temp % 10;
    sum = sum + (int)Math.pow(rem, i);
    temp = temp / 10;
    i--;
}

      }
      
      if(sum==N) return 1;
      else return 0;
    }
};