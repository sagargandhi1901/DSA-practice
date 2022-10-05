package Lecture2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int sum = calculateSum(str);
		System.out.println("Sum : " + sum);
	}

	public static int calculateSum(String str) {
		int n = str.length();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			sum = sum + (ch - 48);
		}
		return sum;
	}
}
