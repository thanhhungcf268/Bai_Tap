import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int[] array = {1, 23, 35, 546, 5, 78, 67, 8};
        Stack<Integer> stack = new Stack<>();
        for (int k : array) {
            stack.add(k);
        }
        for (int j = 0; j < stack.size(); j++) {
            array[j] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
        String arrays = "123456789";
        Stack<Character> stacks = new Stack<>();
        for (int i=0;i<arrays.length();i++) {
            stacks.push(arrays.charAt(i));
        }
        StringBuilder string = new StringBuilder();
        for (int j = 0; j < arrays.length(); j++) {
            string.append(stacks.pop());
        }
        System.out.println(string);
    }
}
