import java.util.Scanner;

public class зажимчисло {
    
    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(",", " ");
        Scanner line = new Scanner(input);

        int value = line.nextInt();
        int min = line.nextInt();
        int max = line.nextInt();
        System.out.println(clamp(value, min, max));
    }
}
