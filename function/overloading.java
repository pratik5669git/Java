public class overloading {
    // //overloading with no. of parameters
    // public static int sum(int a,int b) {
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c) {
    //     return a+b+c;
    // }

    //overloading with type of parameters
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum(float a,float b) {
        return a+b;
    }


    public static void main(String[] args) {
        // System.out.println("Sum = "+sum(2,3));
        // System.out.println("Sum = "+sum(2,3,5));

        System.out.println("Sum = "+sum(2,3));
        System.out.println("Sum = "+sum(2.0f,3.5f));

    }
}
