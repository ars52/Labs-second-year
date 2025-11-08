import java.util.*;

public class треугольник {

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();        
        line = line.replace(",", " ");           
        String[] parts = line.trim().split("\\s+");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        System.out.println(isTriangle(a, b, c));
    }
}
