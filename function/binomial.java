public class binomial {
    public static int factorial(int x) {
        int fact = 1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    public static int bincoeff(int n,int r) {//nCr = n!/r1*(n-r)!
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int ans = fact_n / (fact_r*fact_nmr);

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println("Binomial_coefficent= "+bincoeff(n,r));
    }
}
