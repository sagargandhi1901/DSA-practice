package Lecture1;

import java.util.Scanner;

public class MissingNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			boolean isPresent = checkIfNumberIsPresent(arr, i);
			if(isPresent == false) {
				System.out.println("Missing number : " + i);
			}
		}
	}
	
	public static boolean checkIfNumberIsPresent(int[] arr, int key) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) { 
				return true;
			}
		}
		return false;
	}
}
