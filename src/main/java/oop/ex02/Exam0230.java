package main.java.oop.ex02;

public class Exam0230 {

  static class Calculator {
    static int result = 0;

    static void plus(int value) {
      result += value;
    }

    static void minus(int value) {
      result -= value;
    }

    static void multiple(int value) {
      result *= value;
    }

    static void divide(int value) {
      result /= value;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    System.out.printf("result = %d\n", Calculator.result);
  }
}
