import java.util.Scanner;

public class градусы {
 
    public static double toFarinheit(double celsium) {
        return celsium * 9 / 5 + 32;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double celsium = scanner.nextDouble();
        
        double farinheit = toFarinheit(celsium);
        
        System.out.println(farinheit);
        
    }
}