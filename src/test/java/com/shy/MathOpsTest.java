package com.shy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class MathOpsTest {

    @Test
    public void simpleAdd(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void isNumFound(){
        List<Integer> i = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int targetnum = 9;
        Assert.assertTrue(i.contains(targetnum));
    }

    @Test
    public void getUnique() {
        List<String> li = Arrays.asList(" one", " one ", "two ");
        Set<String> s = new HashSet<>();

        for (String i : li) {
            i = i.trim().toUpperCase();
            s.add(i);
        }
        System.out.println(s);
    }
}
