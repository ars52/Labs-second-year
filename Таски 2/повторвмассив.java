import java.util.HashSet;
import java.util.Scanner;

public class повторвмассив {

    public static boolean hasDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(",", " ").trim();

        if (input.isEmpty()) {
            System.out.println(false);
            return;
        }

        String[] parts = input.split("\\s+");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(hasDuplicates(numbers));
    }
}
