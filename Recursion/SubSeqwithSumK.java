package Recursion;
import java.util.*;
class SubSeqwithSumK
{
    public static void recCall(int idx,int sum,int k,int arr[],ArrayList<Integer>list,int n)
    {
        if(idx>=n)
        {
            if(sum==k)
        {
            System.out.println(list);
            return;
        }
            
        }
        
        list.add(arr[idx]);
        recCall(idx+1,sum+arr[idx],k,arr,list,n);
        list.remove(list.size()-1);
        recCall(idx+1,sum,k,arr,list,n);
    }

    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,1};
        int k=2;
        ArrayList<Integer>list=new ArrayList<>();
        recCall(0,0,k,arr,list,arr.length);
        }
}