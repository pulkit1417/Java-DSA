package basic;
import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        for (int j= 1; j<=n;j++){
            if(n%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
