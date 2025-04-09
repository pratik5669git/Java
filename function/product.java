import java.util.Scanner;

public class product {
    public static int prod(int a, int b) {
        int pro = a*b;
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        int x = sc.nextInt();
        System.out.print("Enter Y:");
        int y = sc.nextInt();
        System.out.println("Product= "+prod(x,y));;
    }
}
