package patterns;
import java.util.*;
public class RevPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nsp=1;
        int nst=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k = 0;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int l = 0;l<=nst;l++){
                System.out.print("*");
            }
            if(i<=n/2){
                nst--;
                nsp=nsp+2;
            }
            else{
                nst++;
                nsp=nsp-2;
            }
            System.out.println();
        }
    }
}
