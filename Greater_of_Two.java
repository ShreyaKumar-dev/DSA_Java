import java.util.*;
public class Greater_of_Two {
    public static float MaxNum(float a, float b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number: ");
        float b = sc.nextFloat();
        System.out.println("The greater number is: "+MaxNum(a,b));
    }
}
