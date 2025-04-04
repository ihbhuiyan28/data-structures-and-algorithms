package linkedlist;

public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean remove(int data) {
        if (head == null) {
            return false;
        }

        Node current = head.next;
        Node previous = head;
        while (current != null) {
            if (current.data == data) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

}