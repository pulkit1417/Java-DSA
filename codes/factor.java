import java.util.*;
public class factor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Factors of "+n+" are: ");
        for (int j= 1; j<=n;j++){
            if(n%j==0){
                System.out.print(j+",");
            }
        }
    }
}