public class Rhombus {
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=m; i>=1; i--){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
