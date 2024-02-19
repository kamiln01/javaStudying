package kayak;

import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word to check if it is a palindrome.");
        String word = scanner.nextLine();
        System.out.println("Word '" + word + "' is palindrome: "+ isPalindrome(word));
    }
    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
