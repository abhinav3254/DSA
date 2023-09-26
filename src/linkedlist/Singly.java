package linkedlist;

public class Singly {

	private Node head;

	public void insertData(int data) {
		Node node = new Node(data);
		
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public int getLengthOfLinkedList() {
		int count = -1;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			count = count+1;
		}
		return count;
	}
	
	public void insertAtStart(int data) {
		Node node = new Node(data);
		
		Node temp = head;
		head = node;
		head.next = temp;
	}
	
	public void insertAtEnd(int data) {
		Node node = new Node(data);
		
		Node temp = head;
		while (temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void insertAt(int index,int data) {
//		index start from 0
		if (index == 0) {
//			go to insertAtStart
			insertAtStart(data);
		} else if (index == getLengthOfLinkedList()) {
//			go to insertAtLast
			insertAtEnd(data);
		} else if (index > getLengthOfLinkedList()) {
			System.out.println("Index Out Of Bound");
		} else {
			// starting from one because temp1 is at index 1 that's why
			int count = 1;
			Node temp1 = head.next;
			Node tempHelper1 = head;
			while (true) {
				if (count == index) break;
				temp1 = temp1.next;
				tempHelper1 = tempHelper1.next;
				count = count + 1;
			}
			Node node = new Node(data);
			tempHelper1.next = node;
			node.next = temp1;
			
		}
	}

	public void printAll() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(" X ");
	}
	
	public int getElementAt(int index) {
		
		Node temp = head;
		int i = 0;
		
		while (temp!=null) {
			if (i == index)
				return temp.data;
			temp = temp.next;
			i++;
		}
		
		return -1;
	}

	/**
	 * Making inner class because we can't place two class with same name
	 * in same package so it's better to make to it inside
	 */
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
//		Linked List counting start from 0th index
		
		Singly one = new Singly();
		one.insertData(10);
		one.insertData(20);
		one.insertData(30);
		one.insertData(40);
		
		one.printAll();
		System.out.println("length of linked list :- "+one.getLengthOfLinkedList());
		
		one.insertAt(1, 11);
		one.insertAtStart(12);
		
		one.insertAtEnd(99);
		one.printAll();
		
		System.out.println("Element at 1th index is "+one.getElementAt(0));
	}
}
