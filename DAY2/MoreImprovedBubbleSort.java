package DAY2;

import java.util.Arrays;

public class MoreImprovedBubbleSort {

	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			boolean swapFlag = false;
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapFlag = true;
				}
			}
			if(swapFlag == false)
				break;
		}
	
	}

	public static void main(String[] args) {

		int arr[] = { 6, 5, 2, 10, 8, 12 };

		System.out.println("Before:" + Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("After:" + Arrays.toString(arr));
		
	}
}
