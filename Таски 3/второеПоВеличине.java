import java.util.*;

public class второеПоВеличине {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        input = input.replace("[", "").replace("]", "").trim();
        String[] parts = input.split(",");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num < max) {
                second = num;
            }
        }

        return second;
    }
}
