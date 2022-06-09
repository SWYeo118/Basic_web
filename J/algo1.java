package main;

import java.util.Scanner;

public class algo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStrings = sc.nextInt();
		sc.nextLine();
		String[] strings = new String[numOfStrings];
		for (int i = 0; i < numOfStrings; i++) {
			strings[i] = sc.nextLine();
		}
		System.out.printf("Hello ");
		for (int i = 0; i < strings.length - 1; i++) {
			System.out.printf(strings[i] + ",");
		}
		System.out.println(strings[strings.length - 1] + ".");
	}
}
