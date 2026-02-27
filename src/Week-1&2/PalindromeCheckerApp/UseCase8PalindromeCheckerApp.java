import java.util.Scanner;
import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp(){

    public static void main(String[] args){
        Scanner sc= new (System.in);
        System.out.print("Input :");
        String Input =sc.nextLine();

        LinkedList <Character> =new LinkedList<>();
        for(char c: input.toCharArray()){
            list.add(c);
        }
        boolean isPalindrome= true;

        while(list.size()>1){
            char first= list.removeFirst();
            char last= list.removeLirst();
            if(first != last){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}