package main.java.oop.ex01;

public class Exam0210 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    Score s1, s2, s3;

    s1 = new Score();
    s2 = new Score();
    s3 = new Score();

    s1.name = "Elise";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3f;

    s2.name = "Even";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = s2.sum / 3f;


    s3.name = "Aave";
    s3.kor = 100;
    s3.eng = 100;
    s3.math = 100;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.aver = s3.sum / 3f;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum,
        s1.aver);
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum,
        s2.aver);
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s3.name, s3.kor, s3.eng, s3.math, s3.sum,
        s3.aver);

  }

}
