import java.util.*;

public class Vote_Eligibility {
    public static void Age(int age){
        if(age>18){
            System.out.println("Eligible to vote.");
        } else{
            System.out.println("Not eligible to vote.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        Age(age);
    }
}
