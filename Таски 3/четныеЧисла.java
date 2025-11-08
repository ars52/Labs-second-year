import java.util.*;

public class четныеЧисла {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        input = input.replace("[", "").replace("]", "");

        if (input.trim().isEmpty()) {
            System.out.println("[]");
            return;
        }

        String[] parts = input.split(",");

        List<Integer> evens = new ArrayList<>();
        for (String part : parts) {
            int num = Integer.parseInt(part.trim());
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        System.out.println(evens);
    }
}
