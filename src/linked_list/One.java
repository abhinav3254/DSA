package linked_list;



public class One {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertNode(int data) {
        Node node;
        if(head == null) {
            node = new Node(data);
            head = node;
        } else {
            node = new Node(data);
            node.next = head;
            head = node;
        }
    }

    public void printList () {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println(" X ");
    }

    public static void main(String[] args) {
        One one = new One();
        one.insertNode(1);
        one.insertNode(2);
        one.insertNode(3);
        one.insertNode(4);
        one.insertNode(5);
        one.insertNode(6);

        one.printList();
    }
}