package arrays;

import java.util.*;

public class intersection {
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,5,6};

        //BRUTE FORCE
        // int[] vis = new int[arr2.length];
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < arr1.length; i++){
        //     for(int j = 0; j < arr2.length; j++){
        //         if(arr1[i] == arr2[j] && vis[j] == 0){
        //             ans.add(arr1[i]);
        //             vis[j] = 1;
        //             break;
        //         }
        //         if(arr2[j] > arr1[i]){
        //             break;
        //         }
        //     }
        // }
        // System.out.println(ans);


        //OPTIMAL
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            } else if(arr1[i] > arr2[j]){
                j++;
            } else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
