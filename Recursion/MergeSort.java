import java.util.*;
public class MergeSort {

    public static void divide(int arr[],int low,int high)
    {
        if(low==high)
        {
            return ;
        }

        int mid=low+(high-low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
         merge(arr,low,mid,high);

    }

    public static void merge(int arr[],int low,int mid,int high)
    {
    
        int left=low;
        int right=mid+1;
     
        int ans[]=new int[high-low+1];

        int k=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                ans[k++]=arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right];
                right++;
            }

            
        }
        while(left<=mid)
        {
           ans[k++]=arr[left];
                left++;
        }
        while(right<=high)
        {
            ans[k++]=arr[right];
                right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=ans[i-low];
        }

    }
  
    public static void main(String[] args) {
        int arr[]=new int[]{7,4,1,5,3};
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        divide(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After Sorting");
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    }
}
