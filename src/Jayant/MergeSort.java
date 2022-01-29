package Jayant;

public class MergeSort {
    public static void sort(int arr[])
    {
        mergeSort(arr,0,arr.length);

    }

    private static void mergeSort(int[] arr, int start, int end) {
        int mid=start+(end-start)/2;
        if(end<2)
            return;
        int left[]= new int[mid];
        int right[]= new int[end-mid];
        for(int i=0;i<mid;i++)
            left[i]=arr[i];
        for(int i=mid;i<end;i++)
            right[i-mid]=arr[i];
        mergeSort(left,0,left.length);
        mergeSort(right,0,right.length);
        mergeArray(left,right,arr);
    }

    private static void mergeArray(int[] left, int[] right,int[] arr) {
        int a=left.length;
        int b=right.length;
        int i=0,j=0,k=0;
        while(i<a && j<b)
        {
            if(left[i]<right[j])
            {
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<a)
        {
            arr[k]=left[i];
            k++;i++;
        }
        while(j<b)
        {
            arr[k]=right[j];
            k++;j++;
        }
    }

}
