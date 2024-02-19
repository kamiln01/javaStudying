package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index of Fibonacci sequence do you want to check");
        int number = scanner.nextInt();
        // n1 = 1, n2 = 2, n3 = 3, n4 = 5, n5 = 8, n6 = 13, n7 = 21
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < number; i++) {
            list.add(list.get(i-2)+list.get(i-1));
        }
        System.out.println(list.getLast());
    }
}
