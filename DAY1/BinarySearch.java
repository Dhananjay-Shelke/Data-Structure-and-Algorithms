package DAY1;

import java.util.Scanner;

public class BinarySearch {
		// |10|20|30|40|50|60|70|80|90|100|
		//               ^
		//               |
		//              mid
	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, mid;

		while (left <= right) { //if left is greater than right then condition false

			mid = (left + right) / 2; // divide and conquer

			if (key == arr[mid])      //i.e. found in first iteration
				return mid;
			if (key < arr[mid])       
				right = mid - 1;	  //shift the mid to left i.e.mid - 1
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; //for binary search array must be sorted
		//if not then sort it first 
		System.out.println("Enter element to Binary search:");
		int result = binarySearch(arr, sc.nextInt());
		System.out.println("Element found at index " + result);
	
	}
}
