package Lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		printMinAndMax(arr, n);
	}

	public static void printMinAndMax(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println("Min : " + arr[0] + " and Max : " + arr[n - 1]);
	}
}
