import java.util.*;

public class rhombus {

    public static void pattern(int n) {
        //outter loop
        for(int i=1; i<=n; i++)
        {
            //space
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("_");
            }
            //starts
            for(int j=1; j<=n; j++)
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