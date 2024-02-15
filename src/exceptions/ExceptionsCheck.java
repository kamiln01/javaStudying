package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner getAge = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = getAge.nextInt();

        if (age >= 18) {
            System.out.println("Jestes pelnoletni. ");
        } else if (age < 0){
            throw new InvalidAgeException("Your age is not valid. ");
        }

    }

}
