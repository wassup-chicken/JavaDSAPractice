package src.com.wassupchicken.dsalgo.stack;

import java.util.Stack;

public class StackStringReverse {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charAr = s.toCharArray();

        for (char c : charAr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                            (c == '}' && top == '{') ||
                            (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(str);
        System.out.println(reverse(str));
        System.out.println(isValid("{{[][{{}}]}}"));
    }


}
