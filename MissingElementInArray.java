import java.io.*;
import java.util.*;
 
class MissingElementInArray {
 
    public static int find(int[] nums, int N)
    {
        int i;
        Arrays.sort(nums);
        for(i=0;i<N;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 0, 7, 4, 5, 6, 8};
        int n = arr.length;
        System.out.println(find(arr, n));
    }
}