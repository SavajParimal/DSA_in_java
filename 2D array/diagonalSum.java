public class diagonalSum{

    public static int Dsum(int arr[][]){
        int sum=0;

        for(int i=0; i<arr.length; i++){
            //pri.sum
            sum+= arr[i][i];

            //sec.sum
            if( i != arr.length-1-i)
                sum+= arr[i][arr.length-1-i];
        }
        return sum;
    }

    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int ans = Dsum(arr);

        System.out.print(ans);
    }
}