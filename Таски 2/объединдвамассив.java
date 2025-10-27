import java.util.*;

public class объединдвамассив {
    public static List<Integer> mergeUniqueSorted(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split("\\],\\s*\\[");
        String part1 = parts[0].replaceAll("[\\[\\]\\s]", "");
        String part2 = parts[1].replaceAll("[\\[\\]\\s]", "");
        int[] a = part1.isEmpty() ? new int[0] : Arrays.stream(part1.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] b = part2.isEmpty() ? new int[0] : Arrays.stream(part2.split(",")).mapToInt(Integer::parseInt).toArray();
        List<Integer> merged = mergeUniqueSorted(a, b);
        System.out.println(merged.toString().replaceAll(", ", ","));
    }
}