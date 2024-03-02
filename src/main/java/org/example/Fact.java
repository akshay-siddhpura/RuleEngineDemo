package org.example;

public class Fact<T> {

  private final String name;
  private final T value;

  public Fact(String name, T value) {
    this.name = name;
    this.value = value;
  }
}
