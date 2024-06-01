import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int k = sc.nextInt();
        boolean result = twosum(arr, k);
        if (result) {
            System.out.println("There are two elements in the array that sum up to " + k);
        } else {
            System.out.println("There are no two elements in the array that sum up to " + k);
        }
    }

    public static boolean twosum(int arr[],int k){
        int n = arr.length-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}