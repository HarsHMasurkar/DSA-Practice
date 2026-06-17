import java.util.*;

public class LostDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long expectedSum = (long) N * (N + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < N - 1; i++) {
            actualSum += sc.nextInt();
        }

        System.out.println(expectedSum - actualSum);
    }
}