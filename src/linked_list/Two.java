package linked_list;

import java.util.Scanner;

public class Two {
    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    Scanner sc =new Scanner(System.in);
    Node head = null;
    int i = 0;
    public void insertNode() {

        do {
            System.out.println("Enter Data:- ");
            int data = sc.nextInt();
            Node node;

            if(head == null) {
                node = new Node(data);
                head = node;
            } else {
                System.out.println("Hit 1 for start");
                System.out.println("Hit 2 for last");
                System.out.println("hit 3 for specific");
                int choice = sc.nextInt();

                if(choice == 1) {
                    node = new Node(data);
                    node.next = head;
                    head = node;
                } 
                if( choice == 2) {
                    node = new Node(data);
                    Node temp = head;
                    while(temp.next!=null) {
                        temp = temp.next;
                    }
                    temp.next = node;
                }
                if(choice == 3) {
                    System.out.println("Enter position");
                    int position = sc.nextInt();
                    Node temp1 = head;
                    Node temp2 = temp1.next;
                    for(int i=1;i<position-1;i++) {
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }
                    node = new Node(data);
                    node.next = temp2;
                    temp1.next = node;
                }
            }

            System.out.println("Hit 0 for new Node");
            i = sc.nextInt();

        } while (i==0);
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
        Two two = new Two();
        two.insertNode();
        two.printList();
    }
}
