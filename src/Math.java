import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me first number: ");
        float number1 = scanner.nextFloat();
        System.out.println("Give me second number: ");
        float number2 = scanner.nextFloat();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));


    }
}
