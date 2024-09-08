import java.util.*;

public class MarkCheck_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.print("Enter the marks: ");
            int mark = sc.nextInt();

            if(mark >= 90){
                System.out.println("This is good.");
            } else if ((mark >= 60) && (mark <= 89)) {
                System.out.println("This is also good.");
            } else {
                System.out.println("This is good as well.");
            }

            System.out.print("Do you want to continue? (1 for Yes / 0 for No): ");
            choice = sc.nextInt();
        }while(choice == 1);
    }
}
