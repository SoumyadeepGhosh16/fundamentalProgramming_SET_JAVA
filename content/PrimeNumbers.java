public class PrimeNumbers {

    static void prime_N(int N){
        
        int x,y,flg;
        
        System.out.println(
            "All the prime numbers within 1 and" +N +
        "are:");

        for ( x = 2; x <= N; x++) {
            
            flg=1;

            for ( y = 2; y < N; y++) {
                if (x % y ==0) {
                    flg=0;
                    break;
                }
            }

            if (flg == 1)
                System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        
        int N=45;

        prime_N(N);
    }
}
