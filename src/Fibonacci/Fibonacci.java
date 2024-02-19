package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index of Fibonacci sequence do you want to check");
        int number = scanner.nextInt();
        // n1 = 1, n2 = 2, n3 = 3, n4 = 5, n5 = 8, n6 = 13, n7 = 21
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < number; i++) {
            list.add(list.get(0)+list.get(1));
            list.remove(list.getFirst());
        }
        System.out.println(number + ". fibonacci sequence number is " + list.getLast());
    }
}
