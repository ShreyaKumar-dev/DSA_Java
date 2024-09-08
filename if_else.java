import java.util.*;

public class if_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2md number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater number.");
        }
        else if(a<b){
            System.out.println(b+" is greater number.");
        }
        else{
            System.out.println(a+" & "+b+" are same");
        }
    }
}