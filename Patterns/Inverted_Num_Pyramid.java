public class Inverted_Num_Pyramid {
    public static void main(String[] args){
        int n = 4;
        int count = 1;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // or

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
            }
            System.out.println();
            count++;
        }
    }
}
