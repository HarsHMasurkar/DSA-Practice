import java.util.*;

public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count = 1;
        int sum = 0;

        for (int i = 1; i< s.length();i++){
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            }

            else{
                if (count % 2 ==0){
                    sum += count;

                }
                count = 1;

            }
        }
        if (count % 2 ==0){
            sum += count;
        }
        System.out.println(sum);
    }
}
