import java.util.Scanner;

public class entering_no_till_mul_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the numbers: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("Multiple of 10 therefore no more enteries.");
    }
}

