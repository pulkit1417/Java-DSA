package arrays;
import java.util.*;

public class sort{
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,1,0,0,0,2,1};
        int n = arr.length;


        //BRUTE T.C -> O(nlogn)
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        //BETTER T.C -> O(2n)
        // int count0 = 0, count1 = 0, count2 = 0;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == 0) count0++;
        //     else if(arr[i] == 1) count1++;
        //     else count2++;
        // }
        // for(int i = 0 ; i < count0; i++){
        //     arr[i] = 0;
        // }
        // for(int i = count0 ; i < count0 + count1; i++){
        //     arr[i] = 1;
        // }
        // for(int i = count0 + count1 ; i < n; i++){
        //     arr[i] = 2;
        // }
        // System.out.println(Arrays.toString(arr));

        //OPTIMAL T.C -> O(n)
        int low = 0, mid = 0, high = n - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                mid++;
                low++;
            } else if (arr[mid] == 1){
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}