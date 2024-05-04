package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        var res = new HashSet<Integer>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                while (num != 0 && num % 2 == 0) {
                    res.add(num);
                    num = num / 2;
                    if(num == 1){
                        res.add(num);
                    }
                }
            } else {
                res.add(num);
                res.add(num * 2);
            }
        }
        return res;
    }
}
