import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1,0,-1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selectionSort(int[] nums) {
        int index, temp;
        for(int i = 0; i < nums.length - 1; i++){
            index = i;
            for(int j = i + 1; j < nums.length; j++){
                //for ASCENDING order
                if(nums[j] < nums[index])
                    index = j;
                
                //for DESCENDING order
                /*
                if(nums[j] > nums[i])
                    index = j;
                */
            }
            //System.out.println("\n" + Arrays.toString(nums));
            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            //System.out.println(Arrays.toString(nums));
        }
    }
}
