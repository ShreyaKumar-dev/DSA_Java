import java.util.*;

public class table {
    public static void Table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(n + " x " + i + " = " + (n * i));
        // }
        Table(n);
    }
}
