import java.util.*;
public class SubSeqSumKFirstSeq
{
    public static boolean recCall(int idx,int sum,int k,int arr[],ArrayList<Integer>list,int n)
    {
        if(idx>=n)
        {
            if(sum==k)
        {
            System.out.println(list);
            return true;
        
        }
            return false;
        }
        
        list.add(arr[idx]);
        if(recCall(idx+1,sum+arr[idx],k,arr,list,n)==true)
        {
            return true;

        }
        list.remove(list.size()-1);
        if(recCall(idx+1,sum,k,arr,list,n)==true)
        {
            return true;
        }

        return false;
    }

    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,1};
        int k=2;
        ArrayList<Integer>list=new ArrayList<>();
       recCall(0,0,k,arr,list,arr.length);
        }
}