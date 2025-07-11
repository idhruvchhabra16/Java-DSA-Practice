
import java.util.*;

public class QuickSort {

    public static void qs(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pidx=findpivet(arr,low,high);
            qs(arr, low, pidx-1);
            qs(arr, pidx+1, high);
        }
    }
    public static int findpivet(int arr[],int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j)
        {
            while(arr[i]<=pivot && i<=high)
            {
                i++;
            }
            while(arr[j]>pivot && j>=low)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp2=arr[j];
        arr[j]=arr[low];
        arr[low]=temp2;

        return j;

       
    }


    public static void main(String[] args) {
        int arr[]=new int[]{4,6,2,5,7,9,1,3};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
