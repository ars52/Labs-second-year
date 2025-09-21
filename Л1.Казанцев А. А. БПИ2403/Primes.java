public class Primes {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {         
            if (isPrime(n)) System.out.print(n + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        for (int d = 2; d * d <= n; d++) {       
            if (n % d == 0) return false;
        }
        return true;
    }
}

