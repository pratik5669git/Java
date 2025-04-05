import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check Prime: ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("Prime");
        }
        else{
            boolean isprime = true;
            for(int i =2;i<=Math.sqrt(n);i++){ //can use i<=n but to optimize we use i till the half of the numer since after that it will be same only
                if(n%i==0){
                    isprime=false;
                }
            }
            if(isprime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
