import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me first number: ");
        float n1 = scanner.nextFloat();
        System.out.println("Give me second number: ");
        float n2 = scanner.nextFloat();
        System.out.println("What calculation do you want to make? " +
                "\nAdd - 1  |   Subtract - 2  |   Multiply - 3  |   Divide - 4  |   Modulo - 5");
        int n3 = scanner.nextInt();

        Math computing = new Math();
        switch (n3) {
            case 1:
                System.out.println("The result is: " + computing.add(n1, n2)); break;
            case 2:
                System.out.println("The result is: " + computing.subtract(n1, n2)); break;
            case 3:
                System.out.println("The result is: " + computing.multiply(n1, n2)); break;
            case 4:
                System.out.println("The result is: " + computing.divide(n1, n2)); break;
            case 5:
                System.out.println("The result is: " + computing.modulo(n1, n2)); break;
        }
    }
}
