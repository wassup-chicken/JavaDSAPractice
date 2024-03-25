package src.com.wassupchicken.dsalgo.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    public static class ListNode {
        private ListNode previous;
        private int data; //generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;

    }

    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }

        head = head.next;
        temp.next = null;
        length--;

        //returning the removed node.
        return temp;
    }

    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }

        tail = tail.previous;
        temp.previous = null;
        length--;

        return temp;
    }

    public void displayForward() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> " );
            temp = temp.next;
        }

        System.out.println("null      Fowrad");
    }

    public void displayBackward() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }

        System.out.println("null      BackWard");
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.head = new ListNode(1);

        dll.insertLast(4);
        dll.insertLast(3);
        dll.insertLast(10);
        dll.insertLast(11);
        dll.insertFirst(100);
        dll.displayBackward();
        dll.displayForward();
        System.out.println(dll.length);
        dll.deleteFirst();
        dll.displayForward();
        System.out.println(dll.length);
        dll.deleteLast();
        dll.displayForward();
        dll.deleteLast();
        dll.displayForward();
    }
}
