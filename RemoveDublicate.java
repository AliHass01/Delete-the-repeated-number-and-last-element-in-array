import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicate {
    public static void main(String[] args) {

        int [] nums = {1,1,2};

        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    public static int[] removeDuplicates(int[] nums) {

        for(int i=0; i< nums.length-1; i++){
            if(nums[i]== nums[i+1]){
                nums[i+1]=nums[i+2];
                nums[i+2]=0 ;
                }
        }
        //copyOf(the original array ,the range of the indexes that you want to cpy to the new array)
        int [] arr = Arrays.copyOf(nums,nums.length-1);

        return arr;
    }
}
