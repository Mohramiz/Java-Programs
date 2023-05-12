import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Multiplicaton table "+ number);
        for(int i=1; i<=10; i++){
            int result = number*i;
            System.out.println(number+"x"+i+"="+result);
        }
    }
}