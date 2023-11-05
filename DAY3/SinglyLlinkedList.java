package DAY2;

import java.util.Scanner;

import DAY3.SinglyCircularLinkedList.Node;

public class SinglyLlinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Display
	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.println("null");
	}

	// addFirst
	public void addFirst(int data) {
		// Step 1: Create newNode
		Node newNode = new Node(data);
		// Step 2: newNode's next should first node's address
		newNode.next = head;
		// Step 3: head should point to newNode
		head = newNode;

	}

	// addLast
	public void addLast(int data) {
		Node newNode = new Node(data);
		// if list id empty, make new node as first node of list
		if (head == null)
			head = newNode;

		// else -> add node add last position
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
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
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			// newnode's next should point to trav's next
			newNode.next = trav.next;
			// trav's next should pointer to new node
			trav.next = newNode;
		}
	}

	// delFirst
	public void delFirst() {
		if (head == null)
			System.out.println("List is empty");
		head = head.next;
	}

	// delLast
	public void delLast() {
		// general: delete the last node
		Node temp = null, trav = head;
		// traverse till last node (trav) and run temp behind it
		while (trav.next != null) {
			temp = trav;
			trav = trav.next;
		}
		// when last node (trav) is deleted, second last node (temp) next should be
		// null.
		temp.next = null;
		// last node (trav) will be garbage collected.
	}

	// delatPosition
	public void delAtPos(int pos) {
		Node temp = null, trav = head;
		for (int i = 1; i < pos; i++) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}

	// delAll
	public void delAll() {
		head = null;
	}

	public static void main(String[] args) {
		SinglyLlinkedList list = new SinglyLlinkedList();
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
				list.delAtPos(pos);
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
