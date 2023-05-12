import java.util.Scanner;

public class averageofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter the elements of an array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextDouble();
        }
        double sum = 0;
        for( int i = 0; i<n; i++){
            sum += arr[i];
        }
        double average = sum/n;
        System.out.println(" Average value is "+ average);
        sc.close();
    }
}
