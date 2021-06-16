package javabasic;

import java.util.Scanner;

public class SquareRootOfSum {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.valueOf(scanner.nextLine());
        int digit2 = Integer.valueOf(scanner.nextLine());
        int sum = digit + digit2;
        System.out.println(Math.sqrt(sum));
 
    }
}
 