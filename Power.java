import java.util.*;
public class Power {
    public static double power(double x, double n){
        if(n==0){
            return 1;
        } else if(n==1){
            return x;
        } else{
            // return x*power(x, n-1);
            return Math.pow(x,n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        double x = sc.nextDouble();
        System.out.print("Enter power value: ");
        double n = sc.nextDouble();
        System.out.println("Value is: "+power(x, n));
    }
}
