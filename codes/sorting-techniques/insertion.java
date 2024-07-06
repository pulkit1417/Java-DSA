public class insertion {
    public static void main(String args[]) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        sort(arr, n);
        printArray(arr);
    }

    public static void sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
