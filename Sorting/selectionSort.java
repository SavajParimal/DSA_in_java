public class selectionSort{

    public static void sortArray(int arr[]){
        for( int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

                //swaping
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {5,1,2,4,3};
        sortArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } 
}