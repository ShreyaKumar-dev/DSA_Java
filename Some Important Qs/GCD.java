import java.util.*;

public class GCD {
    public static int GCDofNum(int n1, int n2){
        int max = Math.max(n1, n2);
        int gcd = 0;
        for(int i=1; i<=max; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();
        int gcd = GCDofNum(n1, n2);
        System.out.println("GDC of "+n1+" and "+n2+" is: "+gcd);
    }
}
