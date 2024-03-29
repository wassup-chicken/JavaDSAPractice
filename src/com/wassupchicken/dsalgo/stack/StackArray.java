package src.com.wassupchicken.dsalgo.stack;

public class StackArray {
    private int top;
    private int[] arr;

    public StackArray(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

     public StackArray() {
        this(10);
     }

     public void push(int data) {
        if(isFull()) {
            throw new RuntimeException("Stack is Full");
        }

        top++;
        arr[top] = data;
     }

     public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to be popped");
        }
        int result = arr[top];
        top--;
        return result;

     }

     public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing in the stack");
        }

        return arr[top];
     }

     public boolean isFull() {
        return arr.length == size();

     }

     public boolean isEmpty() {
        return top < 0;
     }

     //size of the array
     public int size() { return top + 1;}
}
