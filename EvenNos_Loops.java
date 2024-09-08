import java.util.*;
public class EvenNos_Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of even numbers you want to print: ");
        int n = sc.nextInt();
        int i = 0; 
        while(i<=n){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}