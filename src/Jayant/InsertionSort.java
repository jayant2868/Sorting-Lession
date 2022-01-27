package Jayant;

public class InsertionSort {
    public static void sort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int space=i;
            int val=arr[i];
            while(space>0 && arr[space-1]>val)
            {
                arr[space]=arr[space-1];
                space--;
            }
            arr[space]=val;
        }
    }
}
