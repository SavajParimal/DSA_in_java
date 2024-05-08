import java.util.*;

public class butterfly
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of line...");
        int n= sc.nextInt();

        //outter loop1
        for(int i=1; i<=n; i++)
        {
            //1st half
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            //2nd half
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("_");
            }
            //3rd half
            for(int j=n-i; j>=1; j--)
            {
                System.out.print("_");
            }
            //4th half
            for(int j=i; j>=1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //outter loop2
        for(int i=n; i>=1; i--)
        {
            //1st half
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            //2nd half
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("_");
            }
            //3rd half
            for(int j=n-i; j>=1; j--)
            {
                System.out.print("_");
            }
            //4th half
            for(int j=i; j>=1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}