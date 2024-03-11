package src.com.wassupchicken.dsalgo.linkedlist;

public class LinkedListExample {
    private ListNode head;
    private static class ListNode {
        private int data; //generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //print elements of a singly linked list;
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> " );
            current = current.next;
        }
        System.out.println("null");
    }

    //find length of a singly linked list:
    public int findLength() {
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int value, int position) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedListExample sll = new LinkedListExample();

        sll.head = new ListNode(1);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        //chaining together;
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //print singly linked list from head to end;
        sll.display();
        System.out.println("Length is " + sll.findLength());
        sll.insertLast(100);
        sll.display();
    }
}
