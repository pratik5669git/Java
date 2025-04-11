public class conv_dec_to_bin {
    public static void dec_to_bin(int dec) {
        int bin_no = 0;
        int pow = 0;
        int n = dec;
        while(dec>0){
            int rem = dec%2;
            bin_no = bin_no+(rem * (int)Math.pow(10,pow));
            dec/=2;
            pow++;
        }
        System.out.println("Binary of "+n+" = "+ bin_no);
    }
    public static void main(String[] args) {
        dec_to_bin(7);
    }

}
