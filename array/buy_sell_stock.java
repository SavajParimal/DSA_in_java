public class buy_sell_stock
{
    public static int stock(int arr[])
    {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(buyprice < arr[i])
            {
                int todayProfit = arr[i] - buyprice;

                maxprofit = Math.max(maxprofit,todayProfit);
            }
            else
            {
                buyprice=arr[i];
            }
        }

        return maxprofit;
    }

    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        System.out.print("max profit is = " + stock(arr));
    }
}