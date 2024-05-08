import java.util.*;

public class half_pyramd_num {
    
    public static void pattern(int n) {
        //outter loop
        for( int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of line....");
        int n= sc.nextInt();

        pattern(n);
    }
}