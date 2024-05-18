public class babbleSort{
    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    public static void printArraay(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {5,2,3,4,1};
        printArraay(arr);
        System.out.println();
        sort(arr);
        System.out.println();
        printArraay(arr);
    }
}