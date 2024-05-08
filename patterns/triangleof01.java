import java.util.*;

public class triangleof01 {
    //my method..........
    public static void pattern(int n) {

        int k=1,line=1;

        //outter loop
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k);

                if(k==0)
                {
                    k=1;
                }
                else
                {
                    k=0;
                }
            }
            line++;
            if(line%2==0)
            {
                k=0;
            }
            else
            {
                k=1;
            }
            System.out.println();
        }
    }


    // gpt method.......
    public static void pattern2(int n) {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter line of number...");
        int n=sc.nextInt();

        pattern2(n);
    }
}