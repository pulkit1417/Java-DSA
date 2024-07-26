package arrays;

public class singleNumber{
    public static void main(String[] args) {
        int[] nums = {1,1,3,3,5,5,6,6,7,7,8,8,9,9,10};
        int n = nums.length;
        if(nums[0] != nums[1]){
            System.out.println(nums[0]);
            return;
        }
        if(nums[n-1] != nums[n-2]){
            System.out.println(nums[n-1]);
            return;
        }

        int low = 2; 
        int high = n - 3;
        while(low <= high){
            int mid = low +(((high-low))/2);
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                System.out.println(nums[mid]);
                return;
            }
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}