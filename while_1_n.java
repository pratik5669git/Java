import java.util.Scanner;

public class while_1_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till which the number to be printed: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }
}
