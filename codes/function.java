import java.util.*;
public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is "+factorial(n));//function called in print statement
        
    }
    //function made name factorial 
    public static int factorial(int n) {
         int fact=1;
         for(int i=1;i<=n;i++){
             fact=fact*i;
         }
        return fact;
    }
}
