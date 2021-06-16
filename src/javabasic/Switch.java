package javabasic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println(" 1. Addition \n 2. Mutliplication ");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int op= sc.nextInt();
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println(a+b);
			break;
			
		case 2:
			System.out.println(a*b);break;
		default:
			System.out.println("Not a valid option");
		
		}
		

	}

}
