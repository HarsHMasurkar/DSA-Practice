import java.util.*;

public class Lottery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long product1 = arr[n - 1] * arr[n - 2];
        long product2 = arr[0] * arr[1];

        if (product1 >= product2){
            System.out.println(arr[n - 1] * arr[n - 2]);

        }else {
            System.out.println(arr[0] * arr[1]);
        }
    }
}
