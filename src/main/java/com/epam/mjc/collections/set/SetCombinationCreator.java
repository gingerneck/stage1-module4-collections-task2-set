package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        var tempFirst = new HashSet<>(firstSet);
        tempFirst.retainAll(secondSet);
        var res = new HashSet<>(tempFirst);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        res.addAll(thirdSet);
        return res;
    }
}
