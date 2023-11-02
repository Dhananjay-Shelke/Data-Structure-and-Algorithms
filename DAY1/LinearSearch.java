package DAY1;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) { //comparing with every element of array i.e. one by one
			if (key == arr[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 11, 22, 55, 66, 44, 33 };

		System.out.println("Enter element to Linear search: ");
		int element = sc.nextInt();
		int index = linearSearch(arr, element); //passing array and element & storing result in index.
		if (index != 1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found...");

	}
}