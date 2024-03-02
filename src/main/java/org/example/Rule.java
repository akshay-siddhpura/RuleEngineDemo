package org.example;

public interface Rule {

  String name = "rule";
  String description = "description";

  int priority = 0;

  boolean evaluate(Facts facts);

  void execute(Facts facts);
}

