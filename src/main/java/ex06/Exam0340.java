package main.java.ex06;

public class Exam0340 {
	public static void main(String[] args) {
		int i = 0;
		do
			System.out.println(++i);
		while (i < 10);

		System.out.println("-------");

		i = 0;
		do {
			i += 1;
			System.out.println(i);
		} while (i < 10);
	}
}
