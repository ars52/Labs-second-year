import java.util.Scanner;

public class цикличсдвигмассив {

    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr;
        k = k % n;
        if (k < 0) k += n;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();
        int indexOfBracket = input.indexOf("]");
        String arrayPart = input.substring(0, indexOfBracket + 1);
        String kPart = input.substring(indexOfBracket + 1).replace(",", "").trim();

        arrayPart = arrayPart.replace("[", "").replace("]", "").
        replace(",", " ").trim();

        int[] arr;
        if (arrayPart.isEmpty()) {
            arr = new int[0];
        } else {
            String[] nums = arrayPart.split("\\s+");
            arr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
        }

        int k = Integer.parseInt(kPart);
        int[] rotated = rotateRight(arr, k);

        System.out.print("[");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i]);
            if (i < rotated.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}