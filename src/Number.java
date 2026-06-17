import java.util.*;

public class Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long A = sc.nextLong();

        StringBuilder ans = new StringBuilder();

        for (long N = 1; A * N < X; N++) {

            long Z = X - A * N;

            if (Z > 0 && N % Z == 0) {
                ans.append(N).append(" ");
            }
        }

        if (ans.length() == 0) {
            System.out.println("None");
        } else {
            System.out.println(ans.toString().trim());
        }
    }
}