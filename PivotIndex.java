package Semester4;
import java.util.*;
public class EquillibriumCount {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int count =0;
        int rightSum = totalSum;
        for (int i = 0; i < arr.length; i++) {
            rightSum = rightSum- arr[i];
            if (leftSum == rightSum) {
            	count = count +1;
                System.out.println(i);
                return;
            }
            leftSum = leftSum+ arr[i];
        }
        System.out.println(-1);
    }

}
