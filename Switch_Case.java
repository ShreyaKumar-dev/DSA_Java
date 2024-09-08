import java.util.*;

public class Switch_Case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice!=0){
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.println("Choose the operation you want to perform:");
            System.out.println("1 : +\n2 : -\n3 : *\n4 : /\n5 : %");
            int op = sc.nextInt();
            switch(op){
                case 1: System.out.println("Sum: "+(a+b));
                    break;
                case 2: System.out.println("Difference: "+(a-b));
                    break;
                case 3: System.out.println("Product: "+(a*b));
                    break;
                case 4: System.out.println("Quotient: "+(a/b));
                    break;
                case 5: System.out.println("Remainder: "+(a%b));
                    break;
                default: System.out.println("Invalid operation");
            }
            System.out.print("Do you want to perform another operation? (1 for yes/0 for no): ");
            choice = sc.nextInt();
        }
    }
}
