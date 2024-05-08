import java.util.*;

public class Largest_num
{
    public static int large(int arr[])
    {
        int lg=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if( lg < arr[i])
            {
                lg=arr[i];
            }
        }
        return lg;
    }

    public static void main(String args[])
    {
        int num[]={5,4,9,8,6};

        System.out.print("largest number is =" + large(num));
    }
}