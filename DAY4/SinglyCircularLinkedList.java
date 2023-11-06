package DAY3;

import java.util.Scanner;


public class SinglyCircularLinkedList {
	
	Node head = null;
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//display
	public void display() {
		Node trav = head;
		if(head == null) {
			System.out.println("List is Empty...");
		}
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != head);
		
	}
	
	//addLast
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
		}
		
		Node trav = head;
		while(trav.next != head)
			trav = trav.next;
		newNode.next = head;
		trav.next = newNode;
	}
	//addFirst
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
		}
		
		Node trav = head;
		while(trav.next != head)
			trav = trav.next;
		newNode.next = head;
		trav.next = newNode;
		head = newNode;
	}
	// add At Pos
	public void addAtpos(int data, int pos) {
		// special 1: if list is empty, add node at the start
		// special 2: if pos<=1, add node at the start
		if (head == null || pos <= 1)
			addFirst(data);
		// general: add node at given pos
		else {
			// allocate & init new node
			Node newNode = new Node(data);
			// traverse till pos-1 (trav)
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				// special 3: if pos > length of list, add node at the end.
				if (trav.next == head)
					break;
				trav = trav.next;
			}
			// newnode's next should point to trav's next
			newNode.next = trav.next;
			// trav's next should pointer to new node
			trav.next = newNode;
		} 
	}
	
	//delatPosition
	public void delAtPos(int pos) {
		Node temp = null,trav = head;
		for(int i=1; i<pos; i++) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}
	
	//delFirst
	public void delFirst() {
	    //if list is empty
		if(head == null) 
			System.out.println("List is Empty...");
		//if list have only one head
		if(head.next == head)
			head = null;
		Node trav = head;
		//traverse till last node
		while(trav.next != head)
			trav = trav.next;
		//take head to next node(i.e.2nd node)
		head =head.next;
		//tarv's next  point to new head
		trav.next = head;
		
	}
	//delAll
		public void delAll() {
			head = null;
		}
		
	//delLast
		public void delLast(){
			Node temp = null , trav = head;
			while(trav.next!= head) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = head;
		}
		
	public static void main(String[] args) {
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println(
					"\n0.Exit \n1.Display \n2.AddFirst \n3.AddLast \n4.Add at Pos \n5.Del First \n6.Del Last \n7.Del at Pos \n8.Del All ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("List:");
				list.display();
				break;
			case 2:
				System.out.println("Enter element:");
				int data = sc.nextInt();
				list.addFirst(data);
				break;
			case 3:
				System.out.println("Enter element:");
				data = sc.nextInt();
				list.addLast(data);
				break;
			case 4:
				System.out.println("Enter element:");
				data = sc.nextInt();
				System.out.println("Enter position:");
				int pos = sc.nextInt();
				list.addAtpos(data, pos);
				break;
			case 5:
				System.out.println("Deleting First ele:");
				list.delFirst();
				break;
			case 6:
				list.delLast();
				break;
			case 7:
				System.out.println("Enter position:");
				pos = sc.nextInt();
				list.delAtPos( pos);
				break;
			case 8:
				list.delAll();
				break;
			case 0:
				System.out.println("Exit Succcess");
				break;

			default:
				break;
			}
		} while (choice != 0);
	}
}
