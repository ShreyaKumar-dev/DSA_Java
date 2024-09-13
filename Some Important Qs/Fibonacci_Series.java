import java.util.*;

public class Fibonacci_Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length you want Fibonacci Series to go long: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci Series of "+n+"th term is: ");
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}

// There's the pattern question for same : Pascal's TRiangle
