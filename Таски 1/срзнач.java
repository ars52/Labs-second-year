import java.util.Scanner;

public class срзнач {
    
    public static int average(int number1, int number2, int number3) {
        
        return (number1 + number2 + number3) / 3;
    }
    
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int resultr = average(number1, number2, number3);
        
        System.out.println(resultr);
    }
}
