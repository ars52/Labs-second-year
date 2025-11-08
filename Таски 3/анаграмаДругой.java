import java.util.*;

public class анаграмаДругой {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase().replace(",", "");
        s2 = s2.toLowerCase().replace(",", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
