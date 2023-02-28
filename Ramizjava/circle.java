import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of circle");
        double radius = input.nextDouble();
        double area = 3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("Area of circle"+ area);
        System.out.println("Circumference of circle"+ circumference);
    }
}
