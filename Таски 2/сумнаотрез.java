import java.util.Scanner;

public class сумнаотрез {
    
    public static int otrezSum(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            count += i;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(",", " ");
        Scanner line = new Scanner(input);

        int a = line.nextInt();
        int b = line.nextInt();
        
        int result = otrezSum(a, b);
        System.out.println(result);
    }
}
