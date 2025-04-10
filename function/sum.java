import java.util.Scanner;

public class sum {
    public static int calc(int x,int y){
        int sum = x+y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        int sum1 = calc(a,b);
        System.out.println("Sum = "+sum1);
    }
}
