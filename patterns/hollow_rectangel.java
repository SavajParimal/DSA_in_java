import java.util.*;

public class hollow_rectangel {
    public static void pattern(int row, int col)
    {
        //outer loop
        for(int i=1;i<=row;i++)
        {
            //iner loop
            for(int j=1;j<=col;j++)
            {
                //cell(i,j)
                //condition for the start
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row....");
        int row=sc.nextInt();
        System.out.print("enter col....");
        int col = sc.nextInt();

        pattern(row,col);
    }
}