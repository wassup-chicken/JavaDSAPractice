package src.com.wassupchicken.dsalgo.string;

public class StringExample {
    public boolean isPalindrome(java.lang.String word) {
        char[] charArray = word.toCharArray();
        System.out.println(charArray);
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        StringExample palindrome = new StringExample();
        System.out.println(palindrome.isPalindrome("heeeeeeeeeh"));
    }
}