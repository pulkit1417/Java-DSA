package arrays;


import java.util.*;

public class moveZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3,2,0};
        int n = arr.length;
        // ArrayList<Integer> temp = new ArrayList<>(); //S.C -> O(n)   
        // for(int i = 0; i < n; i ++){ //T.C -> 0(n)
        //     if(arr[i] != 0){
        //         temp.add(arr[i]);
        //     }
        // }
        // for(int i = 0; i < temp.size(); i++){// T.C -> O(x)
        //     arr[i] = temp.get(i);
        // }
        // int nonZero = temp.size();
        // for(int i = nonZero; i < n; i ++){// T.C -> O(n - x)
        //     arr[i] = 0;
        // }
        // System.out.println(Arrays.toString(arr));

        int j = - 1;
        for(int i =0 ; i < n; i++){// To find the index of non zero element
            if(arr[i] == 0){
                j = i;
                break;//T.C -> O(x)
            }
        }
        if(j == -1) System.out.println(Arrays.toString(arr));

        for(int i = j + 1; i < n; i ++){// T.C -> O(n -x)
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//BRUTE
 // S.C -> O(n) Extra space
 // T.C -> O(2n)

//OPTIMAL
//S.C -> O(1)
//T.C -> O(n)