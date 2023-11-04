package DAY2;

import java.util.Arrays;

public class ImprovedBubbleSort {

	public static void bubbleSort(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j= 0; j<arr.length-1-i ; j++) {  // -i i.e.dont need to go upto last element
				if(arr[j] > arr[j+1]) {              // because last element is already bigger n sorted
					int temp = arr[j];               //In bubble sort largest element goes to last
					arr[j] = arr [j+1];
					arr[j+1] = temp;
				} 
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {6,4,2,8,3,1};
		
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		bubbleSort(arr);
		
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
}
