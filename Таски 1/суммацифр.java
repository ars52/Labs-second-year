import java.util.Scanner;

public class суммацифр {
    
    public static int digitSum(int number) {
        int sum = 0;

          while (number > 0) {
            sum += number % 10; 
            number /= 10;        
        }

        return sum;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = digitSum(number);

        System.out.println(result);

    }
}
