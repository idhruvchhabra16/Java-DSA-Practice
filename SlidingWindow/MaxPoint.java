public class MaxPoint {
    public static void main(String[] args) {
        int arr[]=new int[]{6,2,3,4,7,2,1,0,1};
        int maxSum=0;
        int sum=0;
        int k=4;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum=lsum+arr[i];
            maxSum=lsum;
        }
        int rindex=arr.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-arr[i];
            rsum=rsum+arr[rindex];
            rindex=rindex-1;

            maxSum=Integer.max(maxSum, lsum+rsum);
        }
        
        System.out.println(maxSum);
    }
    
}
