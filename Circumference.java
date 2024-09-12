import java.util.*;

public class Circumference {
    public static void Circle(int r){
        double circumference = 2 * 3.14 * r;
        System.out.println("Circumference of circle is: " + circumference);
    }

    public static void Square(int side){
        double circumference = 4 * side;
        System.out.println("Circumference of square is: " + circumference);
    }

    public static void Rectangle(int l, int b){
        double circumference = 2 * (l + b);
        System.out.println("Circumference of rectangle is: " + circumference);
    }

    public static void Triangle(int side1, int side2, int side3){
        double circumference = side1 + side2 + side3;
        System.out.println("Circumference of triangle is: " + circumference);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the shape you want to find circumference of");
        System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Triangle");
        System.out.print("Choose one from above: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
            System.out.print("Enter the radius of circle: ");
            int radius = sc.nextInt();
            Circle(radius); 
            break;

            case 2: 
            System.out.print("Enter the side of square: ");
            int side = sc.nextInt();
            Square(side); 
            break;

            case 3: 
            System.out.print("Enter the length of rectangle: ");
            int length = sc.nextInt();
            System.out.print("Enter the breadth of rectangle: ");
            int breadth = sc.nextInt();
            Rectangle(length, breadth); 
            break;

            case 4: 
            System.out.print("Enter the 1st side of triangle: ");
            int side1 = sc.nextInt();
            System.out.print("Enter the 2nd side of triangle: ");
            int side2 = sc.nextInt();
            System.out.print("Enter the 3rd side of triangle: ");
            int side3 = sc.nextInt();
            Triangle(side1, side2, side3); 
            break;

            default: System.out.println("Wrong choice");
        }
    }
}
