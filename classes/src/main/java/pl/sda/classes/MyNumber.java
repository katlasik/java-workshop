package pl.sda.classes;

import java.util.Objects;

public class MyNumber {

  private final int value;

  public MyNumber(int i) {
      this.value = i;
  }

  public int value() {
    return value;
  }

  public boolean isOdd() {
    return value % 2 != 0;
  }

  public boolean isEven() {
    return !isOdd();
  }

  public MyNumber sqrt() {
    return new MyNumber((int) Math.sqrt(value));
  }

  public MyNumber pow(MyNumber x) {
    return new MyNumber((int) Math.pow(value, x.value));
  }

  public MyNumber add(MyNumber x) {
    return new MyNumber(value + x.value);
  }

  public MyNumber subtract(MyNumber x) {
    return new MyNumber(value - x.value);
  }

  @Override
  public String toString() {
    return "MyNumber{" +
            "value=" + value +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyNumber myNumber = (MyNumber) o;
    return value == myNumber.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
