import java.util.Scanner;

public class простчисло {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean result = isPrime(number);

        System.out.println(result);

    }
}