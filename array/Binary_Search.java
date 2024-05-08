import java.util.*;

public class Binary_Search
{
    public static int binary(int key, int arr[])
    {
        int start=0,end=arr.length - 1;
        while(start <= end)
        {
            int mid=(start+end)/ 2;
            if( arr[mid]==key)
            {
                return mid+1;
            }
            else if(key>mid)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int ans=binary(key,arr);

        if(ans==-1)
        {
            System.out.print("value is not found....");
        }
        else
        {
            System.out.print("value id found is postin of =" + ans);
        }
    }
}