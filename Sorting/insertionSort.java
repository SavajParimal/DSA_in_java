public class insertionSort{

    public static void sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int temp=arr[i],prev=i-1;
            while(prev>=0 && arr[prev]>arr[i]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    }

    public static void main(String args[]){
        int arr[]= {1,5,2,3,4};
        sort(arr);
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}