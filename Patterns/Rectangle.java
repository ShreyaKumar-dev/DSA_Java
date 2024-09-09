public class Rectangle {
    public static void main(String[] args){
        // int rows = 5;
        // int cols = 5;
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         if(i==0 || i==rows-1 || j==0 || j==cols-1){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        int m=4; int n=5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
