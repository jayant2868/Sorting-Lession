package Jayant;

public class BubbleSort {
    public static void sort(int[] num)
    {
        boolean flag=true;
        int temp;
        for(int i=1;i<num.length;i++)
        {
            for(int j=0;j<num.length-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=false;
                }
            }
            if(flag)
                break;
        }
    }
}
