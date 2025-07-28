import java.util.ArrayList;
import java.util.HashSet;

public class SubSetSum2 {
    public static void findSum(int index,int arr[],ArrayList<Integer>list,HashSet<ArrayList<Integer>>set)
    {
        if(index==arr.length)
        {
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        findSum(index+1, arr, list, set);
        list.remove(list.size()-1);
        findSum(index+1, arr, list, set);
    }
    public static void main(String[] args) {
        HashSet<ArrayList<Integer>>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        int arr[]={1,2,2};
        findSum(0,arr,list,set);
        System.out.println(set);
    }
    
}
