import java.util.*;

public class diamond {

    public static void pattern(int n) {
        //1 st half
        for(int i=1; i<=n; i++)
        {
            //space
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //2 nd half
        for(int i=n; i>=1; i--)
        {
            //space
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter line of number...");
        int n=sc.nextInt();

        pattern(n);
    }
}