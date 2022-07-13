package main.java.ex06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		drawStar(inputInt());

	}

	static int inputInt() {
		Scanner keybordInput = new Scanner(System.in);
		int btline;
		System.out.print("밑변 길이? ");
		btline = keybordInput.nextInt();
		keybordInput.close();

		return btline;
	}

	static void drawLine(int length) {
		int colunm = 0;
		while (colunm++ < length) {
			System.out.print("*");
		}
	}

	static void drawStar(int length) {
		int row = 0;
		while (row++ < length) {
			drawLine(row);
			System.out.println();
		}
	}
}