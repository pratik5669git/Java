import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter any operator to use it (+,-,*,/,%): ");
        char oper = sc.next().charAt(0);
        switch (oper) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '%':System.out.println(a%b);
                break;
            default:System.out.println("Wrong choice");
        }
        }
    }
