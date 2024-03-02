package org.example;

public class RuleAction implements Action {

  String expression;

  RuleAction(String expression) {
    this.expression = expression;
  }

  @Override
  public void execute(Facts fact) {
    // execute action
  }
}
