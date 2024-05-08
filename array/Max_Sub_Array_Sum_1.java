public class Max_Sub_Array_Sum_1
{
    public static int max_sum(int arr[])
    {
        int max=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                int  sum=0;
                for(int k=i; k<=j; k++)
                {
                    sum+=arr[k];
                }
                System.out.println(sum);
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[]={1,-3,-4,5};
        System.out.print("max sum = " + max_sum(arr));
    }
}