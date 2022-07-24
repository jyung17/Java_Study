package main.java.oop.ex02;


// # 사용자 정의 데이터 타입

public class Exam0110 {
  // ## 사용자 정의 데이터 타입 만들기
  // - 인스턴스 변수를 사용하여 학생의 성적 테이러를 담을 메모리를 설계한다.

  static class Score {
    // 인스턴스 변수(instance variable; instance field)
    // - new 며영으로 생성되는 변수이다.
    // - 데이터를 개별적으로 다루고 싶을 때는 인스턴스 변수를 선언한다.
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 사용자 정의 데이터 타입을 사용하는 방법
    // - new 명령을 사용하여 설계도에 기술된 대로 메모를 준비한다.
    // - 메모리는 Heap영역에 생성된다. - 메모리 주소를
    // 레퍼런스(주소 변수)에 저장한다.

    Score score = new Score();

    // -클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
    score.name = "홍길동";
    score.kor = 100;
    score.eng = 90;
    score.math = 85;
    score.sum = score.kor + score.eng + score.math;
    score.average = score.sum / 3f;

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", score.name, score.kor, score.eng, score.math,
        score.sum, score.average);

  }

}
