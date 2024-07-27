package arrays;
import java.util.ArrayList;

public class leaders {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0 , 6};
        ArrayList<Integer> temp = new ArrayList<>();
        int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     boolean leader = true;
        //     for(int j = i + 1; j < n; j++){
        //         if(nums[j] > nums[i]){
        //             leader = false;
        //             break;
        //         }
        //     }
        //     if(leader == true){
        //         temp.add(nums[i]);
        //     }
        // }
        // System.out.println(temp); 
        int max = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(nums[i] > max){
                max = nums[i];
                temp.add(nums[i]);
            }
        }
        System.out.println(temp);
    }
}
