import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a= sc.nextInt();
        if(a>0 ){
            System.out.println("Number is positive");
        }else if( a<0){
            System.out.println("Number is negative");
        }else if(a==0){
            System.out.println("Zero");
        }else {
            System.out.println("I DONT KNOW");
        }
    }
}
