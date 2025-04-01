import java.util.Scanner;

public class while_sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till which to find the sum: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}
