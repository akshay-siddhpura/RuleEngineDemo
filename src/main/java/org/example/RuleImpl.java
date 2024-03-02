package org.example;

import java.util.List;

public class RuleImpl implements Rule {

  Condition condition;
  List<Action> actions;

  @Override
  public boolean evaluate(Facts facts) {
    return condition.evaluate(facts);
  }

  public void when(Condition condition) {
    this.condition = condition;
  }

  public void then(Action action) {
    actions.add(action);
  }

  @Override
  public void execute(Facts facts) {
    actions.forEach(x -> x.execute(facts));
  }
}
