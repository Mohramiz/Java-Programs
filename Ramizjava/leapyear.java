import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        a = sc.nextInt();
        if(a%4==0){
            System.out.println("year is leap year");
        }else{
            System.out.println("Year is not leap year");
        }
    }
}
