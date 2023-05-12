import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digits");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = a+b+c;
        System.out.println("Additon is"+d);
    }
}
