package main.java.baekjoon;

import java.util.Scanner;

public class Main_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
