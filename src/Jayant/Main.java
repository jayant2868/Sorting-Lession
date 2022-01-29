package Jayant;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException
    {
        int arr[] = {5,2,4,7,10,14,12,11,17};
        int num[]= new int[arr.length];
        populateArray(num,arr);
        SelectionSort selectionSort= new SelectionSort();
        System.out.println(Arrays.stream(num).max().getAsInt());
        selectionSort.sort(num);
        System.out.println("Selection Sort:");
        printArray(num);
        populateArray(num,arr);
        printArray(num);
        BubbleSort.sort(num);
        System.out.println("Bubble Sort");
        printArray(num);
        populateArray(num,arr);
        InsertionSort.sort(num);
        System.out.println("Insertion Sort");
        printArray(num);
        populateArray(num,arr);
        MergeSort.sort(num);
        System.out.println("Merge Sort");
        printArray(num);
        populateArray(num,arr);
        System.out.println("Quick Sort");
        QuickSort.sort(num);
        printArray(num);
    }
    public static void printArray(int[] arr)
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void populateArray(int num[],int arr[])
    {
        for(int i=0;i<arr.length;i++)
            num[i]=arr[i];
    }
}
