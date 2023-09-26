package linkedlist;

public class Doubly<T> {

	private Node<T> head;
	private Node<T> tail;
	private Node<T> helper;

	public void insertData(T data) {
		Node<T> node = new Node<T>(data);
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
		Node<T> t = head;
		while (t != null) {
			System.out.print(t.data + "  ");
			t = t.next;
		}
	}

	public void printFromLast() {
		Node<T> temp = tail;

		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.prev;
		}

	}

	/**
	 * Making inner class because we can't place two class with same name
	 * in same package so it's better to make to it inside
	 */
	static class Node<T> {
		Node<T> prev;
		T data;
		Node<T> next;

		Node(T data) {
			prev = null;
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		Doubly<String> two = new Doubly<>();
		two.insertData("10");
		two.insertData("20");
		two.insertData("30");
		two.insertData("Last");

		System.out.println("Printing From Start :- ");
		two.printFromOne();

		System.out.println();
		System.out.println("Printing From Last :- ");
		two.printFromLast();
	}

}
