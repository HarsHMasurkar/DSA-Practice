import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter sorted array elements: ");

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n-1;
        int mid = 0;
        boolean found = false;

        while(low<=high) {
            mid = (low+high)/2;

            if(arr[mid]==key) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            }
            else if(arr[mid]<key)
                low = mid+1;
            else
                high = mid-1;
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}