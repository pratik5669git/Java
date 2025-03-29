public class ternary_op {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int larger = (a>b)? a:b;
        System.out.println(larger);

        int number = 15;
        String type = ((number%2)==0)?"Even":"Odd";
        System.out.println(type);
    }
}
