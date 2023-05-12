import java.util.Scanner;
public class divisble {
   public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    a = sc.nextInt();
    if(a%5==0 && a%11==0){
        System.out.println("a is divisble");
    }else{
        System.out.println(a+"not divisible");
    }
   } 
}
