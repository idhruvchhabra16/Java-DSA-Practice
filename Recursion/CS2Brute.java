package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
// Combination Sum Brute Force Approach
public class CS2Brute {

    public static void Combination(int arr[],int idx,int target,ArrayList<Integer>list,HashSet<ArrayList<Integer>>finalList)
{
    if(idx==arr.length || target<=0)
    {
        if(target==0 && !finalList.contains(list))
        {
            finalList.add(new ArrayList<>(list));
        }
        return;
    }
    if()
}
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2};
        int target=4;
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<ArrayList<Integer>>finalList=new ArrayList<>();
        Combination(arr, 0, 0, list, finalList);

    }
}
