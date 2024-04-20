package Tasks;

public class StringReversing {

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            // Swap characters at start and end indices
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            // Move indices towards each other
            start++;
            end--;
        }
        return new String(chars);
    }
}
