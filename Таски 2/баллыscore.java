import java.util.*;

public class баллыscore {
    public static String grade(int score) {
        if (score < 0 || score > 100) return "Invalid";
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println(grade(score));
    }
}
