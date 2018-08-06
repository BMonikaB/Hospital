package com.example.demo.utils;

import java.util.Comparator;
import java.util.Set;

public class GenId {

    public static int getNewId(Set<Integer> keyId) {

        if (keyId.isEmpty()) {
            return 0;
        } else {
            Integer integer = keyId.stream().max((o1, o2) -> o1.compareTo(o2)).get();
            return integer + 1;
        }
    }

}
