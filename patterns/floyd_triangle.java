import java.util.*;

public class floyd_triangle {

    public static void pattern(int n) {
        int cont=1;
        //outter loop
        for(int i=1; i<=n; i++)
        {
            //inner loop
            for(int j=1; j<=i; j++)
            {
                System.out.print(cont);
                if(cont<10)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(" ");
                }
                cont++;
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