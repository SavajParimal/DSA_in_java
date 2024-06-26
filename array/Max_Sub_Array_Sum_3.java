public class Max_Sub_Array_Sum_3
{
    public static void max_sum(int arr[])
    {
        int cs=0,ms=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            cs = cs + arr[i];
            if( cs < 0 )
            {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.print("max sum = " + ms);
    }
    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        max_sum(arr);
    }
}