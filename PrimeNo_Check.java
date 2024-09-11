import java.util.*;
public class PrimeNo_Check {
    public static int PrimeCheck(int n){
        int count = 0;

        if(n<2){
            count = 1;
        } else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                    count += 1;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = PrimeCheck(n);
        // int count = 0;

        // if(n<2){
        //     System.out.println("Not a prime number");
        // } else {
        //     for(int i=2; i<n; i++){
        //         if(n%i == 0){
        //             count += 1;
        //         }
        //     }
        // }

        if(count == 0){
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
