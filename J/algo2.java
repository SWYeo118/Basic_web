package main;

import java.util.Scanner;

public class algo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coordinateX = sc.next();
		String coordinateY = sc.next();
		String coordinateR = sc.next();
		int numOfTrees = sc.nextInt();
		String[] treeX = new String[numOfTrees];
		String[] treeY = new String[numOfTrees];
		for (int i = 0; i < numOfTrees; i++) {
			treeX[i] = sc.next();
			treeY[i] = sc.next();
		}
		for (int i = 0; i < numOfTrees; i++) {
			double X = Math.pow((Double.parseDouble(coordinateX) - Double.parseDouble(treeX[i])), 2);
			double Y = Math.pow((Double.parseDouble(coordinateY) - Double.parseDouble(treeY[i])), 2);
			double R = Math.sqrt(X + Y);
			if (R >= Double.parseDouble(coordinateR)) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}
		}

	}
}
