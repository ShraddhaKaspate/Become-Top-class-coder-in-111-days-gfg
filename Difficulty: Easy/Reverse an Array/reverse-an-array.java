class Solution
{
    public void reverseArray(int arr[])
    {
        // code here
        int n=arr.length;
        int res[]=new int[n];
        /*
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                res[j]=arr[i];
                
            }
        }
        System.out.print(res);
        */
        
        int i=n-1,j=0;
        while(j<res.length){
            res[j]=arr[i];
            j++;
            i--;
        }
        
       for( i=0;i<res.length;i++){
           arr[i]=res[i];
       } 
    }
 
}