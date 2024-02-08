import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Nah, give me your real age.");
        } else if (age >= 120) {
            System.out.println("Holy cow, you look young :).");
        } else if (age < 18){
            System.out.println("I'm sorry, you can't buy a beer.");
        } else {
            System.out.println("Congratulations, you can buy a beer!");
        }

    }
}
