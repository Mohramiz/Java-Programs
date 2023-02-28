import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digits");
        int number = sc.nextInt();
        int num1 = number/100;
        int num2 = (number/10) % 10;
        int num3 = number%10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        int reverse = (num3 *100) + (num2*10) + num1;
        System.out.println("Reverse of " + number + " is " + reverse);
    }
}
