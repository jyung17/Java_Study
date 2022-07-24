package main.java.oop.ex02.util;

public class Calculator {
  public int result;

  public void plus(int i, int j) {
    this.result = i + j;
  }

  public void minus(int result, int i) {
    this.result = result - i;
  }

  public void multiple(int result, int i) {
    this.result = result * i;
  }

  public void divide(int result, int i) {
    this.result = result / i;
  }
}
