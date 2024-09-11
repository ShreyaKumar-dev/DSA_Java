import java.util.*;

public class Factorial{
    public static void NFactorial(int n){
        int fact = 1;
        if(n==0 || n==1){
            fact = 1;
        } else if(n < 1){
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        } else{
            // Recursion method used
            // fact = n*NFactorial(n-1);
            // Iterative method used
            for(int i=n; i>=1; i--){
                fact *= i;
            }
        }

        System.out.println("Factorual is: "+fact);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        NFactorial(n);
    }
}