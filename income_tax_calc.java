import java.util.Scanner;

public class income_tax_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your income: ");
        double inc = sc.nextDouble();
        double tax;
        if(inc<500000){
            tax=0;
        }
        else if(inc>=500000 && inc<1000000){
            tax=inc*0.2;
        }
        else
            tax=inc*0.3;
        
        System.out.println("Tax = "+tax);

    }
}
