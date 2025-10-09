import java.util.Scanner;

public class днинедели {

    public static String daysToWeeks(int days) {
        int weeks = days / 7;   
        int remainingDays = days % 7; 

        String weekWord;
        if (weeks == 1) {
            weekWord = "неделя";
        } else if (weeks >= 2 && weeks <= 4) {
            weekWord = "недели";
        } else {
            weekWord = "недель";
        }

        String dayWord;
        if (remainingDays == 1) {
            dayWord = "день";
        } else if (remainingDays >= 2 && remainingDays <= 4) {
            dayWord = "дня";
        } else {
            dayWord = "дней";
        }

        return weeks + " " + weekWord + " и " + remainingDays + " " + dayWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        String result = daysToWeeks(days);

        System.out.println(result);
    }
}