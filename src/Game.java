import java.util.*;
public class Game {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] board = new int[N];
        int [] student = new int[N];
        int [] copyOfStudent = new int[N];

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextInt() - 1;
            student[i] = i;
            copyOfStudent[i] = i;

        }

        int beats = 0;
        while (true){
            beats++;
            int[] next = new int[N];
            for (int i = 0; i < N; i++) {
                next[board[i]] = student[i];

            }
            if (Arrays.equals(next, copyOfStudent)) {
                break;
            }
            student = next;
        }
        System.out.println(beats);
    }

}
