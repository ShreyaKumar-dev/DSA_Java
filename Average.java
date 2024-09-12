import java.util.*;
public class Average {
    public static int Avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        System.out.println("Average is: "+Avg(a,b,c));
    }
}
