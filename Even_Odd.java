import java.util.*;

public class Even_Odd {
    public static void OddEven(int n){
        if(n%2==0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        OddEven(n);
    }
}
