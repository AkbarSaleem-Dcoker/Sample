import java.util.Scanner;

public class PrimeDevisor {

    static final int MAXN = 100001;
    static boolean prime[] = new boolean[MAXN];

    static void SieveOfEratosthenes()
    {

        for(int i = 0;i<prime.length;i++)
            prime[i]=true;
         // 0 and 1 are not prime numbers
        prime[0] = false;
        prime[1] = false;
         for (int p = 2; p * p < MAXN; p++) {
         // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
         // Update all multiples of p as non-prime
                for (int i = p * p; i < MAXN; i += p)
                    prime[i] = false;
            }
        }
    }

    // Find the common prime divisors
    static void common_prime(int a, int b)
    {
        int gCommonPrime =0;
        // Get the GCD of the given numbers
        int gcd = (int) __gcd(a, b);
         for (int i = 2; i <= (gcd); i++) {
             if (prime[i] && gcd % i == 0) {
               // System.out.print(i + " ");
                gCommonPrime=i;
            }
        }

        System.out.println(gCommonPrime);
    }
    static long __gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return __gcd(b % a, a);
    }
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        SieveOfEratosthenes();
        common_prime(num1, num2);
    }
}
