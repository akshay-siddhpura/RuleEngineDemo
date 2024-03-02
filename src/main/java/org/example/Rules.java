package org.example;

import java.util.HashSet;
import java.util.Set;

public class Rules {

    Set<Rule> rules = new HashSet<>();
    public void register(Rule rule){
    rules.add(rule);
    }
    public void unregister(String ruleName){

    }
    public void unregister(Rule rule)
    {
        rules.remove(rule);
    }

}
