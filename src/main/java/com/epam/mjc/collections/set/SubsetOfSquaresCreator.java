package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        var res = new TreeSet<Integer>();
        for (Integer num : sourceList) {
            res.add(num * num);
        }
        return res.subSet(lowerBound,true, upperBound, true);
    }
}
