public class swapping_call_by_value{
    public static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("At func. values");
        System.out.println("A="+a);
        System.out.println("B="+b);

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("At main func. values");//here values reamins unaltered as the values are changed in copy not in the same memory
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
