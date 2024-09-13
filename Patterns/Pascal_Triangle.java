import java.util.*;

public class Pascal_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            int num = 1;

            for(int j=0; j<=i; j++){
                System.out.print(num + " ");
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

// This is Fibonacci Series pattern representation
