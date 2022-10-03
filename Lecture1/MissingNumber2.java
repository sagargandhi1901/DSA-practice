package Lecture1;

import java.util.Scanner;

public class MissingNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}

		int sumOfFirstNNumbers = (n * (n + 1)) / 2;
		int sumOfArrayElements = calculateSum(arr);
		
		System.out.println("Missing number : " + (sumOfFirstNNumbers - sumOfArrayElements));
	}

	private static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
