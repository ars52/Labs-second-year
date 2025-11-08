import java.util.*;

public class считаетКолвоГласных {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(countVowels(input));
    }

    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiou";

        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}