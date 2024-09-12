import java.util.*;
public class OddNo_Sum {
    public static int Odd_Sum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of odd numbers till you want to sum up: ");
        int n = sc.nextInt();
        System.out.println("Sum till "+n+" is: "+Odd_Sum(n));
    }
}
