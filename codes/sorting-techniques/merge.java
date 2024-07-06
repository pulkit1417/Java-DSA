import java.util.ArrayList;

public class merge {
    public static void main(String args[]) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        sort(arr, 0, n - 1);
        printArray(arr);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        sort(arr, low, mid); // left half
        sort(arr, mid + 1, high); // right half
        mergeSort(arr, low, mid, high); // merging sorted halves
    }

    public static void mergeSort(int[] arr, int low, int mid, int high) {
        int left = low; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        while (left <= mid && right <= high) { // storing elements in the temporary array in a sorted manner//
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
