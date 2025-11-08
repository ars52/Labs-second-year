import java.util.*;

public class разницаМежду {

    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return max - min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine()
                .replace("[", "")
                .replace("]", "")
                .trim();

        String[] parts = input.split(",");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(differenceMaxMin(arr));
    }
}
