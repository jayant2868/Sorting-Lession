package Jayant;

public class QuickSort {
    public static void sort(int[] arr)
    {
        quickSort(arr,0,arr.length-1);
    }

    private static int partitionArray(int[] arr,int start,int end) {
        int index=start,temp;
        int pivot=arr[end];
        for(int i=start;i<end;i++)
        {
            if(arr[i]<=pivot)
            {
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }

        }
        temp=arr[index];
        arr[index]=arr[end];
        arr[end]=temp;

        return index;
    }
    public static void quickSort(int[] arr,int start,int end)
    {
        if(start<end) {
            int index = partitionArray(arr, start, end);
            quickSort(arr, start, index-1);
            quickSort(arr, index + 1, end);
        }
    }
}
