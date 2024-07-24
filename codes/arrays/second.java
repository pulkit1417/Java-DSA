package arrays;
public class second {
    public static void main(String[] args) {
        // int[] arr = { 13, 46, 24, 52, 20, 9 };
        // int largest = arr[0];
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > largest){
        //         largest = arr[i];
        //     }
        // }
        // int slargest = -1;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > slargest && arr[i] != largest){
        //         slargest = arr[i];
        //     }
        // }
        // System.out.println(slargest);

        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}