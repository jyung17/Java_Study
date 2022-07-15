package main.java.oop.ex02;

public class Exam0240 {

  static class Calculator {
    int result = 0;

    static void plus(Calculator obj, int value) {
      obj.result += value;
    }

    static void minus(Calculator obj, int value) {
      obj.result -= value;
    }

    static void multiple(Calculator obj, int value) {
      obj.result *= value;
    }

    static void divide(Calculator obj, int value) {
      obj.result /= value;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 2); // + 2
    Calculator.plus(c2, 3); // + 3

    Calculator.plus(c1, 3); // + 2 + 3
    Calculator.multiple(c2, 2); // + 3 * 2

    Calculator.minus(c1, 1); // + 2 + 3 - 1
    Calculator.plus(c2, 7); // + 3 * 2 + 7

    Calculator.multiple(c1, 7); // + 2 + 3 - 1 * 7
    Calculator.divide(c2, 4); // + 3 * 2 + 7 / 4

    Calculator.divide(c1, 3); // + 2 + 3 - 1 * 7 / 3 = ?
    Calculator.minus(c2, 5); // + 3 * 2 + 7 / 4 - 5 = ?

    // 식1의 계산 결과는 c1 인스턴스의 result 변수에 들어 있고,
    // 식2의 계산 결과는 c2 인스턴스의 result 변수에 들어 있다.
    System.out.printf("c1.result = %d\n", c1.result);
    System.out.printf("c2.result = %d\n", c2.result);
  }
}
