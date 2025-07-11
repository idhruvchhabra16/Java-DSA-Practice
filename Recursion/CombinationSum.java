import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void CS(int arr[],int target,int index,ArrayList<Integer>list,ArrayList<List<Integer>>finalList)
    {
        if(index==arr.length)
        {
            if(target==0)
            {
                finalList.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target)
        {
            list.add(arr[index]);
            CS(arr, target-arr[index], index, list, finalList);
            list.remove(list.size()-1);
        }
        CS(arr,target,index+1,list,finalList);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7};
        int target=7;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<List<Integer>>finalList=new ArrayList<>();
        CS(arr,target,0,list,finalList);
        for(List<Integer>li:finalList)
        {
            System.out.println(li);
        }
    }
}
