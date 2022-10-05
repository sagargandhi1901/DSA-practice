package Lecture2;

import java.util.Scanner;

public class CheckValidTriangle {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		boolean isValidTriangle = check(s1, s2, s3);
		
		if(isValidTriangle) {
			System.out.println("Valid");
		} else {
			System.out.println("Not valid");
		}
	}

	private static boolean check(int s1, int s2, int s3) {
		if ((s1 + s2) > s3 && (s2 + s3) > s1 && (s3 + s1) > s2) {
			return true;
		}
		return false;
	}
}
