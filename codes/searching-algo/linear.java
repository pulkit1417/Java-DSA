import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = { 4, 7, 10, 13, 15, 20, 21, 24, 26, 28 };
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
