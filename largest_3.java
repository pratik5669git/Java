import java.util.Scanner;

public class largest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("Largest: "+a);
        }
        else if(b>=a && b>=c){//b>=c only will also work as a is not the largest
            System.out.println("Largest: "+b);
        }
        else{
            System.out.println("Largest: "+c);
        }

    }
}
