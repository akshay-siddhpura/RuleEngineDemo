package org.example;

public class RuleCondition implements Condition {

  String expression;

  RuleCondition(String expression) {
    this.expression = expression;
  }

  @Override
  public boolean evaluate(Facts facts) {
    return false;
  }
}
