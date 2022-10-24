class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }

}
public class LinkedList {
    static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void deleteNode(Node head, int position) {

        // List is empty
        if (head == null) {
            return;
        }

        // If position is 1st, removing head node
        if (position == 1) {
            head = head.next;
            return;
        }
        Node prevNode = head;
        int i = 2;
        while (prevNode != null && i != position) {
            prevNode = prevNode.next;
            i++;
        }
        // When position is more than number of node
        if (prevNode == null || prevNode.next == null) { //?
            return;
        }
        prevNode.next = prevNode.next.next;
		//return head;
    }

    static void addNode(Node head, int data, int position) {
        position++;
        if (head == null)
            return;
        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        Node tempNode = head;
        int temp = 0;
        while (tempNode != null) {
            tempNode = tempNode.next;
            temp++;
        }
		temp++;
        //System.out.println("number of linkedlist is " + temp);
        if (position > temp) {
            return;
        }

        int i = 2;
        Node prevNode = head; //!
        while (prevNode != null && i != position) {
            prevNode = prevNode.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[]args) {
        Node head = null;
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        printList(head);
        addNode(head, 6, 5);
        System.out.println("\n______\n");
        printList(head);
        addNode(head, 7, 6);
        System.out.println("\n______\n");
        printList(head);
        addNode(head, 8, 7);
        System.out.println("\n______\n");
        printList(head);
    }

}
