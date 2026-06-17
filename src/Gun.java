import java.util.*;

public class Gun{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        PriorityQueue<Integer>grps = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++){
            int b = sc.nextInt();
            if (b>0) grps.add(b);
        }

        int min = 0;
        while(grps.size() >= K){
            List<Integer> list =  new ArrayList<>();
            for (int i  = 0; i < K; i++){
                int b = grps.poll() -1;
                if (b>0) list.add(b);

            }
            grps.addAll(list);
            min++;
        }
        System.out.print(min);
    }
}
