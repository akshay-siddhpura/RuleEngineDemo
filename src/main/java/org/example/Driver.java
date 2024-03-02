package org.example;

public class Driver {
  public static void main(String[] args) {

    Facts facts = new Facts();
    facts.putFact(new Fact("cartValue", 50));



    Condition condition = new RuleCondition("cartValue == 100");
    Action action = new RuleAction("delivery free");

    RuleImpl rule = new RuleImpl();
    rule.when(condition);
    rule.then(action);

    Rules rules = new Rules();
    rules.register(rule);


    RuleEngine ruleEngine = new RuleEngineImpl();
    ruleEngine.fire(rules, facts);
  }
}
