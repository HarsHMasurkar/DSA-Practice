import java.util.Scanner;

public class Linear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element:  ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i=0; i<n; i++){
            if(arr[i] == key){
                System.out.println("Element found at Position : " +(i+1));
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Element not found");
        sc.close();
    }
}
