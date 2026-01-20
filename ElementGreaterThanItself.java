package Semester4;
import java.util.*;

public class ElementGreaterThanItself {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr [] = new int[size];
		for (int i=0; i<size; i++) {
			  arr [i] = in.nextInt();
			
		}
		int max = arr[0]; // calculating max element
		for(int i=0; i<arr.length; i++) {
			if (arr[i]> max) {
				max = arr[i];
			}
		}
		int count =0; // every element which is not equal to max is the element grater than itself
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=max) {
				count ++;
			}
		}System.out.println(count);
	}

}
