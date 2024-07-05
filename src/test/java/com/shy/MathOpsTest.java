package com.shy;

import org.testng.annotations.Test;

import java.util.*;

public class MathOpsTest {
    @Test
    public void getUnique() {
        List<String> li = Arrays.asList("one", "one", "two");
        Set<String> s = new HashSet<>();

        for (String i : li) {
            s.add(i);
        }
        System.out.println(s);
    }
}
