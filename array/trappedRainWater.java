public class trappedRainWater
{
    public static int Rain_water(int arr[])
    {
        int n = arr.length;

        //left max find
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }

        //right max find
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }

        //find trapped rain water
        int water = 0;
        for(int i=0; i<n; i++)
        {
            //find boundry
            int waterlevel=Math.min(left[i],right[i]);

            //find water
            water = water + waterlevel - arr[i];
        }

        return water;
    }

    public static void main(String args[])
    {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.print("trapped Rain Water = " + Rain_water(arr));
    }
}