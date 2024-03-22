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
            ListNode currentThatWillNewNodeWillPointTo = previous.next;
            newNode.next = currentThatWillNewNodeWillPointTo;
            previous.next = newNode;
        }
    }

    // delete a node

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int counter = 1;
        ListNode previous = head;
        while (counter < count - 1) {
            previous = previous.next;
            counter++;
        }

        System.out.println("last   " + previous.data);
        previous.next = null;

        return previous;
    }

    public ListNode deleteLastExample() {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public ListNode deleteAtPosition(int position) {
        ListNode current = head;
        if (position == 1) {
            head = head.next;
            current.next = null;
        } else {
            int count = 1;
            ListNode previous = null;
            while (count < position) {
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;

        }

        return current;
    }

    public void deleteAtPositionExample(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position -1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean findElement(int data) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void reverseLinkedList() {

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public ListNode findNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }

        if (n <=0) {
            throw new IllegalArgumentException("Invalid value n");
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }

    public void removeDupFromSorted() {
        if ( head == null) {
            return;
        }

        ListNode current = head;
        while(current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;

        return head;
    }

    public void deleteKeyInSortedSinglyLinkedList(int key) {
        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if (current == null) return;

        temp.next = current.next;

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
  //      sll.display();
        System.out.println("Length is " + sll.findLength());
        sll.insertAtPosition(100, 3);
//        sll.display();
//        sll.deleteFirst();
//        sll.display();
//        sll.deleteLast();
//        sll.display();
//        sll.deleteAtPosition(5);
//        sll.display();
        sll.reverseLinkedList();
        sll.display();
    }
}
