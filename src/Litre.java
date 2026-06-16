import java.util.*;

public class Litre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long R1 = sc.nextLong();
        long R2 = sc.nextLong();
        long R3 = sc.nextLong();

        long glassCost = R2 - R3;
        long liters = 0;

        if (R1 <= glassCost) {
            liters = N / R1;
        } else {
            while (N >= R2) {
                liters++;
                N = N - R2 + R3;
            }

            liters += N / R1;
        }

        System.out.println(liters);
    }
}