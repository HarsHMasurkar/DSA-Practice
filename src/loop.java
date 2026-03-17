import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number from 1 to 10 :");

        for(int i = 1; i <= 10; i++)
        {
            System.out.print(i);
        }

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        if(number > 0)
        {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
