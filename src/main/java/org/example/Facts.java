package org.example;

import java.util.HashSet;
import java.util.Set;

public class Facts {
    Set<Fact> set = new HashSet<>();

    void putFact(Fact fact)
    {
        set.add(fact);
    }

    Fact<?> getFact(Fact fact)
    {
        return null;
    }
}