import java.util.ArrayList;
import java.util.List;

public class AllPermutation2 {
    public static void recans(int index,int nums[],List<List<Integer>>ans){
        if(index==nums.length)
        {
            ArrayList<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(i,index,nums);
            recans(index+1, nums, ans);
            swap(i,index,nums);
        }
    }
    public static void swap(int i,int j,int nums[])
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        List<List<Integer>>ans=new ArrayList<>();
        int nums[]={1,2,3};
        recans(0,nums,ans);
        System.out.println(ans);
    }
    
}
