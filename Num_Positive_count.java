import java.util.*;

public class Num_Positive_count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}