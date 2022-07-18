package main.java.oop.ex02;

public class Exam0250 {

  static class Calculator {
    int result = 0;

    static void plus(Calculator obj, int value) {
      // 인스턴스 변수를 다루는 메서드는 작업을 수행할 때 그 인스턴스 주소를 받아야 한다.
      // result 는 더이상 클래스 변수가 아니기 때문에 직접 접근할 수 없다.
      // 오직 인스턴스 주소를 통해서만 접근 할 수 있다.
      obj.result += value;
    }

    static void minus(Calculator obj, int value) {
      obj.result -= value;
    }

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
}
