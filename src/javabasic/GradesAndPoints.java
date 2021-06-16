package javabasic;

import java.util.Scanner;

public class GradesAndPoints {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int var = scan.nextInt();
 
        if (var < 0) {
            System.out.println("Grade:impossible!");
        } else if (var >= 0 && var < 50) {
            System.out.println("Grade:failed");
        } else if (var >= 50 && var < 60) {
            System.out.println("Grade:1");
        } else if (var >= 60 && var < 70) {
            System.out.println("Grade:2");
        } else if (var >= 70 && var < 80) {
            System.out.println("Grade:3");
        } else if (var >= 80 && var < 90) {
            System.out.println("Grade:4");
        } else if (var >= 90 && var < 101) {
            System.out.println("Grade:5");
        } else if (var > 100) {
            System.out.println("Grade:incredible");
        }
 
    }
}