package linkedlist;

public class Singly<T> {

	private Node<T> head;

	public void insertData(T data) {
		Node<T> node = new Node<T>(data);
		
		if (head == null) {
			head = node;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public int getLengthOfLinkedList() {
		int count = -1;
		Node<T> temp = head;
		while (temp != null) {
			temp = temp.next;
			count = count+1;
		}
		return count;
	}
	
	public void insertAtStart(T data) {
		Node<T> node = new Node<T>(data);
		
		Node<T> temp = head;
		head = node;
		head.next = temp;
	}
	
	public void insertAtEnd(T data) {
		Node<T> node = new Node<T>(data);
		
		Node<T> temp = head;
		while (temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void insertAt(int index,T data) {
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
			Node<T> temp1 = head.next;
			Node<T> tempHelper1 = head;
			while (true) {
				if (count == index) break;
				temp1 = temp1.next;
				tempHelper1 = tempHelper1.next;
				count = count + 1;
			}
			Node<T> node = new Node<T>(data);
			tempHelper1.next = node;
			node.next = temp1;
			
		}
	}

	public void printAll() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(" X ");
	}
	
	public T getElementAt(int index) {
		
		Node<T> temp = head;
		int i = 0;
		
		while (temp!=null) {
			if (i == index)
				return temp.data;
			temp = temp.next;
			i++;
		}
		
		return null;
	}

	/**
	 * Making inner class because we can't place two class with same name
	 * in same package so it's better to make to it inside
	 */
	static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
//		Linked List counting start from 0th index
		
		Singly<String> one = new Singly<String>();
		one.insertData("Raman");
		one.insertData("Mohan");
		one.insertData("Shyam");
		one.insertData("Rahul");
		
		one.printAll();
		System.out.println("length of linked list :- "+one.getLengthOfLinkedList());
		
		one.insertAt(1, "insertAt");
		one.insertAtStart("start");
		
		one.insertAtEnd("insert at end");
		one.printAll();
		
		System.out.println("Element at 1th index is "+one.getElementAt(0));
	}
}
