import java.util.Scanner;
import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input :");
        String input =sc.nextLine();

        LinkedList <Character> list =new LinkedList<>();
        for(char c: input.toCharArray()){
            list.add(c);
        }
        boolean isPalindrome= true;

        while(list.size()>1){
            char first= list.removeFirst();
            char last= list.removeLast();
            if(first != last){
                isPalindrome= false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
        sc.close();
    }
}