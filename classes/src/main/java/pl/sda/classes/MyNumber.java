package pl.sda.classes;

import java.util.Objects;

public class MyNumber {

  private final int value;

  public MyNumber(int value) {
      this.value = value;
  }

  public int value() {
    return 0;
  }

  public boolean isOdd() {
    return false;
  }

  public boolean isEven() {
    return false;
  }

  public MyNumber sqrt() {
    return null;
  }

  public MyNumber pow(MyNumber x) {
    return null;
  }

  public MyNumber add(MyNumber x) {
    return null;
  }

  public MyNumber subtract(MyNumber x) {
    return null;
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
