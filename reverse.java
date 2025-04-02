public class reverse {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while(n!=0){
            int d = n%10;
            rev = rev*10+d;
            n/=10;
        }
        System.out.println("Reverse = "+rev);

        //to print the reverse of a number
        
        // while(n!=0){
        //     int d = n%10;
        //     System.out.print(d);
        // //     n/=10;
        // }
        // System.out.println();
    }
}
