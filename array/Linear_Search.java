import java.util.*;

public class Linear_Search
{
    public static int l_search(int key,int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number you found....");
        int ch= sc.nextInt();

        int number[] = {1,2,5,3,4,6,7,9,8,10};

        int a = l_search(ch,number);
        System.out.print(a);
        
    }
}