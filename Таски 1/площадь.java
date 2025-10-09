import java.util.Scanner;

public class площадь {
    
    public static double toResult(double longe, double width ) {
        return longe * width;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double longe = scanner.nextDouble();

        double width = scanner.nextDouble();

        double resultr = toResult(longe, width);
        
        System.out.println(resultr);
    }
}
