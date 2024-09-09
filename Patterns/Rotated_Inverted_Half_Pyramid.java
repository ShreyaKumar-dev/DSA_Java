// Need to debug -> wrong output

public class Rotated_Inverted_Half_Pyramid {
    public static void main(String[] args){
        int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; i<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
