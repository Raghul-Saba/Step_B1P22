import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

class PalindromeAlgorithms {

    public static boolean stackMethod(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean dequeMethod(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        long startStack = System.nanoTime();
        boolean stackResult = PalindromeAlgorithms.stackMethod(input);
        long endStack = System.nanoTime();

        long startDeque = System.nanoTime();
        boolean dequeResult = PalindromeAlgorithms.dequeMethod(input);
        long endDeque = System.nanoTime();

        System.out.println("Stack Method Result: " + stackResult);
        System.out.println("Stack Execution Time: " + (endStack - startStack) + " ns");

        System.out.println("Deque Method Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + (endDeque - startDeque) + " ns");

        scanner.close();
    }
}