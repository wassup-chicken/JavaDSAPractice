package src.com.wassupchicken.dsalgo.stack;

import java.util.Stack;

public class StackExample {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int[] nextGreaterElement(int[] arr) {

        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
           if (!stack.isEmpty()) {
               while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                   stack.pop();
               }
           }
            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        StackExample ngE = new StackExample();
        int[] arr = {1, 2, 3, 4, 5};
        int[] someArr = ngE.nextGreaterElement(arr);
        ngE.printArray(someArr);

    }
}
