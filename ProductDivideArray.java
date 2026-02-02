package Semester4;
import java.util.Scanner;
public class ProductDivideArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int product =1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        int [] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = product / arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        
        
	}
