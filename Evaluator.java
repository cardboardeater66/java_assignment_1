package com.mason.evaluator;

import java.util.Scanner;


public class Evaluator {
	
	static boolean end; 
	static int SOLUTION;
	static int LAST_INT;
	static int add(int x, int y) {
		return (x + y);
		
	}
	
	static int subtract(int x, int y) {
		return(x - y);
		
	}
	
	static int divide(int x, int y) {
		return x/y;
		
	}
	
	static int multiply(int x, int y) {
		return x*y;
		
	}
	
	static int modulo(int x, int y) {
		return x%y;
		
	}
	
	
	static int calculate(int LAST_INT, int SOLUTION) {
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c=='.') {
			end = true;
			return SOLUTION;
		}
		int n = sc.nextInt();
		if (c == '+') {
			return add(LAST_INT, n);
		}
		else if (c=='-') {
			return subtract(LAST_INT, n);
		}
		else if (c=='*') {
			return multiply(LAST_INT, n);
		}
		else if (c=='/') {
			return divide(LAST_INT, n);
		}
		else if (c=='%') {
			return modulo(LAST_INT, n);
		}
		else {
			System.out.println("Invalid character.");
			return LAST_INT;
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the expression:\n");
		
		int num = s.nextInt();
		
		SOLUTION = calculate(num, SOLUTION);
		
		while (!end) {
			LAST_INT = SOLUTION;
			SOLUTION = calculate(LAST_INT, SOLUTION);
		}
		System.out.println("The SOLUTION is " + SOLUTION);
	}
}