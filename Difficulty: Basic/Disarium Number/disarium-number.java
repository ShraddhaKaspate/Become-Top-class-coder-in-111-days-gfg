// User function Template for Java
/*
class Solution
{
    static int isDisarium(int N)
    {
        // code here
        int temp=N;
        int r=0,digits=0,sum=0;
        
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        
        temp=N;
        
        while(temp>0)
        {
            for(int i=digits;i>=1;i--)
            {
       
                 r=temp%10;
                 temp=temp/10;
                 sum=sum+(int)Math.pow(r,i);
             }
        }
        System.out.println(sum);
        if(sum==N)
        {
          System.out.println("yes");  
        }
        else
        {
            System.out.println("no");
        }
        
        
    }
}*/
class Solution {
    static int isDisarium(int N) {
        int temp = N;
        int digits = 0;

        // Step 1: Count the number of digits
        while (temp > 0) {
            
            temp /= 10;
            digits++;
        }

        temp = N;
        int sum = 0;

        // Step 2: Calculate sum of digits raised to their respective positions
        for (int i = digits; temp > 0; i--) {
            int r = temp % 10;
            temp /= 10;
            sum += Math.pow(r, i);
        }

        // Step 3: Check if it's a Disarium number
        if (sum == N) {
            return 1; // Yes
        } else {
            return 0; // No
        }
    }
}