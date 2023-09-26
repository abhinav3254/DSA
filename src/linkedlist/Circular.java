package linkedlist;

public class Circular {
	
	private Node head;
	private Node tail;
	private Node helper;
	
	public void insertData(int data) {
		Node node = new Node(data);
		if (head == null) {
			this.head = node;
			this.tail = node;
			this.helper = node;
		} else {
			tail = node;
			helper.next = tail;
			tail.prev = helper;
			helper = helper.next;
			tail.next = head;
			head.prev = tail;
		}
	}
	
	/**
	 * This was Just For check
	 * if nothing is null means head and tail is poiting to each other 
	 */
	/*
	public void printFromStartCheck() {
		int count = 0;
		Node temp = head;
		while (temp!=null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
			count++;
			if (count == 12) break;
		}
		System.out.println("Break at count = 12");
	}
	*/
	
	/**
	 * Now everthing is correct then this is the actual way how we are going to
	 * print the elements
	 * */
	public void printFromStart() {
		Node temp = head;
		do {
			
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		} while (temp != head);
	}
	
	public static void main(String[] args) {
		Circular circular = new Circular();
		circular.insertData(10);
		circular.insertData(20);
		circular.insertData(30);
		circular.insertData(40);
		circular.insertData(50);
		
		circular.printFromStart();
	}
	
	static class Node {
		Node prev;
		int data;
		Node next;
		
		Node (int data) { this.data = data; }
	}
	
}
