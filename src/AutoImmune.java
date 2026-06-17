import java.util.Scanner;

public class AutoImmune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int high = 0, low =0;

        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();

            if (age <=10 || age >=81){
                high++;
            }
            else{
                low++;
            }
        }

        int highDays = (high + L -1) / L;
        int normalDays = (low + L -1) / L;

        int totalDays = highDays + normalDays;

        System.out.println(totalDays + "Days");
    }
}
