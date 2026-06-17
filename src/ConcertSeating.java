import java.util.*;

public class ConcertSeating {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i< n; i++){
            int seat = sc.nextInt();
            if (seat == 0){
                count ++;

            }
        }
        System.out.print(count);
    }
}
