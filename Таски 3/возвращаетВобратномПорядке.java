import java.util.*;

public class возвращаетВобратномПорядке {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
