package Jayant;

public class SelectionSort {
public void sort(int[] arr)
{
    int temp,min;
    for(int i=0;i<arr.length-1;i++)
    {
        min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
                min=j;
        }
        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
}
}
