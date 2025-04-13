import java.util.Scanner;

public class factorial {
    public static double calc_fact(double x) {
        double fact = 1;
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial = ");
        double n = sc.nextDouble();
        System.out.println("Factorial = "+calc_fact(n));
    }
}
