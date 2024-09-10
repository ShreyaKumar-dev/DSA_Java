public class Alt01_Triangle {
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

// Method Used:
// 1. We are using two loops to print the pattern. In this question, rows = columns. 
// 2. To print alternate pattern of 0 & 1, calculate cell number in form of matrix (i,j).
// 3. Sum up the row no. & column no. If the sum of i and j is even, print 1 else print 0.
// The condition becomes: 
// if (i+j)%2==0 => print 1; else => print 0.

