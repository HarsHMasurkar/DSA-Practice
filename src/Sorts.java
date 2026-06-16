import java.util.*;

public class Sorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String key = sc.nextLine();

        int[] freq = new int[256];

        // Count frequency of characters in input string
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder result = new StringBuilder();

        // Append characters according to key order
        for (char ch : key.toCharArray()) {
            while (freq[ch] > 0) {
                result.append(ch);
                freq[ch]--;
            }
        }

        System.out.println(result.toString());
    }
}