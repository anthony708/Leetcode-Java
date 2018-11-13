package Math;

/**
 * #204 Count Primes
 * Easy
 * @author zhuduan
 * 2018/11/09
 */

public class CountPrimes {
    public int countPrimes(int n) {
        int res = 0;
        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            if (isPrime[i] == false) {
                res++;
                for (int j = 2; i * j < n; j++ ) {
                    isPrime[i*j] = true;
                }
            }
        }
        return res;
    }


}
