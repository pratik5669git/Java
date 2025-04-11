public class prime_in_range {
    public static boolean is_prime(int n) {
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int x) {
        for(int j=2;j<=x;j++){
            if(is_prime(j)){
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(100);
    }
}
 