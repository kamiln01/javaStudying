package Fibonacci;

import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index of Fibonacci sequence do you want to check");
        int number = scanner.nextInt();
        fibo(number);
    }

    public static void fibo(int n) {
        long n1 = 1;
        long n2 = 1;
        for (int i = 2; i < n; i++) {
            long temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n + ". number of Fibonacci sequence is " + n2);

    }
}
