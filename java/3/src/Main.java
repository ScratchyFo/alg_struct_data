class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void reverse() {
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(9);
        list.push(7);
        list.push(3);
        System.out.println("Входной лист list:");
        list.printList();
        list.reverse();
        System.out.println("\nРазвернутый лист list:");
        list.printList();
    }
}