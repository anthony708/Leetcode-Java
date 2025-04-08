package hot100.TwoPointers;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        int front = 0, back = s.length() - 1;
        char[] arr = s.toCharArray();
        while (front < back) {
            if (isLetter(arr[front]) && isLetter(arr[back])) {
                char temp = arr[front];
                arr[front] = arr[back];
                arr[back] = temp;
                front++;
                back--;
            } else if (!isLetter(arr[front])) {
                front++;
            } else if (!isLetter(arr[back])) {
                back--;
            } else {
                front++;
                back--;
            }
        }
        return new String(arr);
    }

    public boolean isLetter(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
}
