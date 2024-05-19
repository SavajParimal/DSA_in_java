public class search_in_sorted_matrix{

    public static boolean search(int arr[][],int key){
        int row=0,col=arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
                return true;
            }
            else if(key > arr[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        if(search(arr,5)){
            System.out.print("value is found");
        }
        else{
            System.out.print("value is not found");
        }
    }
}