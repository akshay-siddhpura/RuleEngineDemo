package org.example;

import java.util.Iterator;

public class RuleEngineImpl implements RuleEngine {
  @Override
  public void fire(Rules rules, Facts fact) {
    Iterator<Rule> itr = rules.rules.iterator();

    while (itr.hasNext()) {
      Rule rule = itr.next();

      boolean result = rule.evaluate(fact);
      if (result) {
        rule.execute(fact);
      }
    }
  }
}
