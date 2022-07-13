package main.java.ex06;

import java.util.Scanner;

public class Exam0241 {
	public static void main(String[] args) {
		int level;

		final int GUEST = 0, MEMBER = 1, ADMIN = 2;

		Scanner sc = new Scanner(System.in);

		level = sc.nextInt();
		sc.close();

		switch (level) {
		case GUEST:
			System.out.println("조회만 가능합니다.");
			break;
		case MEMBER:
			System.out.println("글작성 가능합니다");
			break;
		case ADMIN:
			System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다");
			break;
		}
	}

}
