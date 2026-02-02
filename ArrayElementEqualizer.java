package Semester4;
import java.util.Scanner;

public class ArrayElementEqualiser {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int count =0;
        for(int i=0; i<arr.length; i++) {
			if (arr[i]> max) {
				max = arr[i];
			}
		}
        int time = 0;
        for(int i=0; i<arr.length; i++) {
        	count = max - arr[i];
        	time = time + count;
        }
        System.out.println(time);
        
	}

}
