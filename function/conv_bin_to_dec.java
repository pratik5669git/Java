public class conv_bin_to_dec {
    public static void binToDec(int bin) {
        int n=bin;
        int pow=0;
        int dec_no=0;

        while(bin>0){
            int ld = bin%10;
            dec_no = dec_no + (ld * (int)Math.pow(2,pow));
            pow++;
            bin/=10;
        }
        System.out.println("Decimal of "+n+" is "+dec_no);
    }
    public static void main(String[] args) {
        binToDec(1010);
    }
}
