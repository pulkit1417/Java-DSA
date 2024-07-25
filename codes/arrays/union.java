package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class union {
    public static void main (String args[]){
        int[] arr1 = {10, 7, 8, 12, 11, 15, 13};
        int[] arr2 = {1, 3, 45, 8, 10};
        //BRUTE
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr1.length; i++) {
        //     set.add(arr1[i]);
        // }
        // for(int i = 0; i < arr2.length; i++){
        //     set.add(arr2[i]);
        // }
        // System.out.println(set);

        //OPTIMAL
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println(union);
    }
}
