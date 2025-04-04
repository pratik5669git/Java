import java.util.Scanner;
public class skip_mul_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the numbers: ");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("Multiple of 10 can't be taken");
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}


