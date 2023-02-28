import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double breadth = sc.nextDouble();
        double area = length*breadth;
        double perimeter = 2 * (length + breadth);
        System.out.println("area of rectangle"+area);
        System.out.println("perimeter of rectangle"+perimeter);
    }
}
