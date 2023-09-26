package linkedlist;

public class Doubly {

	private Node head;
	private Node tail;
	private Node helper;

	public void insertData(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = head;
			helper = head;
		} else {
			tail = node;
			helper.next = node;
			tail.prev = helper;
			helper = helper.next;
		}
	}

	public void printFromOne() {
		Node t = head;
		while (t != null) {
			System.out.print(t.data + "  ");
			t = t.next;
		}
	}

	public void printFromLast() {
		Node temp = tail;

		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.prev;
		}

	}

	/**
	 * Making inner class because we can't place two class with same name
	 * in same package so it's better to make to it inside
	 */
	static class Node {
		Node prev;
		int data;
		Node next;

		Node(int data) {
			prev = null;
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		Doubly two = new Doubly();
		two.insertData(10);
		two.insertData(20);
		two.insertData(30);
		two.insertData(40);

		System.out.println("Printing From Start :- ");
		two.printFromOne();

		System.out.println();
		System.out.println("Printing From Last :- ");
		two.printFromLast();
	}

}
