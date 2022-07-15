package main.java.baekjoon;

public class ArrayTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] values = {100, 200, 300, 400, 500, 600};
  }

  static void delete(int[] values, int index) {
    if (index < 0 || index >= values.length) {
      return;
    }

    for (int i = index + 1; i < values.length; i++) {
      values[i - 1] = values[i];
    }

    values[values.length - 1] = 0;
  }
}
