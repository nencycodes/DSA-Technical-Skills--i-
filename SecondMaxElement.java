import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second maximum not possible");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max, secondMax;

        // Initialize using first two elements
        if (arr[0] > arr[1]) {
            max = arr[0];
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }
        for (int i = 2; i < n; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (max == secondMax) {
            System.out.println("No second distinct maximum");
        } else {
            System.out.println("Second Maximum: " + secondMax);
        }

        sc.close();
    }
}
