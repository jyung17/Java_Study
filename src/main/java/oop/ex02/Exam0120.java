package main.java.oop.ex02;

// # 사용자 정의 데이터 타입 + 클래스 메서

public class Exam0120 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    public static void calculate(Score score) {
      score.sum = score.kor + score.eng + score.math;
      score.average = score.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s = new Score();
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 85;

    Score.calculate(s);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.average);

  }
}
