import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = { 4, 7, 10, 13, 15, 20, 21, 24, 26, 28 };
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                found = true;
                break;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(found);
    }
}