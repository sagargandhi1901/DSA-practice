package Lecture1;

import java.util.Scanner;

public class MinAndMax2 {

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
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} 
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Min : " + min + " and Max : " + max);
	}
}