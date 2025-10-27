import java.util.Scanner;

public class сумположмассив {


   public static int sumOfPositives(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(",", " ");
        Scanner line = new Scanner(input);

        int[] numbers = new int[input.split("[,\\s]+").length];
        int index = 0;
        while (line.hasNextInt()) {
            numbers[index++] = line.nextInt();
        }

        int result = sumOfPositives(numbers);
        System.out.println(result);
    }
}
