package linkedlist;

public class Singly {

	private Node head;
	private Node temp;

	public void insertData(int data) {
		Node node = new Node(data);
		;
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void printAll() {
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(" X ");
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
	}
}
