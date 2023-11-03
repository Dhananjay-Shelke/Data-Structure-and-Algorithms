package DAY1.classSelectionSort;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {
	
	public static void selectionSortbyAge(Person[] arr) {
		for(int i=0; i<arr.length-1 ; i++)
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].getAge() > arr[j].getAge()) {
					Person temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
	
	public static void selectionSortbyId(Person[] arr) {
		for(int i=0; i<arr.length-1 ; i++)
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].getId() > arr[j].getId()) {
					Person temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
	}
	
	public static void selectionSortbyName(Person[] arr) {
		for(int i=0; i<arr.length-1 ; i++)
			for(int j=i+1; j<arr.length; j++) {
			if(arr[i].compareTo(arr[j]) > 0)
				{
					Person temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
	}
	
	public static void main(String[] args) {
		
		Person arr[] = new Person[5];
		arr[0] = new Person(1,"ram",20);
		arr[1] = new Person(2,"karan",18);
		arr[2] = new Person(5,"dev",15);
		arr[3] = new Person(3,"manav",25);
		arr[4] = new Person(4,"samrat",21);
		
		System.out.println("Before Sort....");
		System.out.println(Arrays.toString(arr));

		
		System.out.println("After sort by age:");
		selectionSortbyAge(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After sort by Id:");
		selectionSortbyId(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After sort by Name:");
		selectionSortbyName(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
