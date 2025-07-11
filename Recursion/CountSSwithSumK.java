import java.util.*;

class CountSSwithSumK
{
     public static int recCall(int idx,int sum,int k,int arr[],int n)
    {
        if(sum>k) return 0;
      if(idx>=n)
      {
        if(sum==k)
        {
            return 1;
        }
        return 0;
      }
    
      int left=recCall(idx+1, sum+arr[idx], k, arr, n);
      int right=recCall(idx+1, sum, k, arr, n);

      return left+right;
    }
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,1};
        int k=2;
        ArrayList<Integer>list=new ArrayList<>();
        int ans=recCall(0,0,k,arr,arr.length);
        System.out.println(ans);
        
    }
}