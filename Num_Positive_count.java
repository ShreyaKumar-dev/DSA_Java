import java.util.*;

public class Num_Positive_count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int PosCount = 0;
        int NegCount = 0;
        int ZeroCount = 0;

        char choice;
        do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n>0){
                PosCount += 1;
            } else if(n<0){
                NegCount += 1;
            } else{
                ZeroCount += 1;
            }

            System.out.print("Do you want to enter more number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive Count: " + PosCount);
        System.out.println("Negative Count: " + NegCount);
        System.out.println("Zero Count: " + ZeroCount);
    }
}