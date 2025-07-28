
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSetSum1 {
    public static void findSum(int index,int arr[],int sum,ArrayList<Integer>list)
    {
        if(index==arr.length)
        {
            list.add(sum);
            return;
        }

        findSum(index+1, arr, sum+arr[index], list);
        findSum(index+1, arr, sum, list);
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        findSum(0, arr, sum, list);
        Collections.sort(list);
        System.out.println(list);


    }
    
}
