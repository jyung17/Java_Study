package main.java.oop.ex03;

import java.util.Scanner;

public class Exam0310 {

  static class Math {
    public static int abs(int value) {
      if (value < 0) {
        return value * -1;
      }
      return value;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력하세요> ");
    int value = sc.nextInt();

    int result = Math.abs(value);

    System.out.printf("절대값=%d\n", result);
  }

}
