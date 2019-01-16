package com.kg.college;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import com.kg.college.MyEvenOdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MyEvenOddTest {
    private int num;
    private boolean expected;
    private MyEvenOdd myEvenOdd;
    String s;

    public MyEvenOddTest(String s,int num, boolean expected) {
        this.num = num;
        this.expected = expected;
        this.s=s;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input() {
        return Arrays.asList(new Object[][] {{"abc",20,true}, { "bag",100, true }, {"Hellow", 1, false }, {"Tread", 3, false } });
    }

    @Before
    public void before() {
        myEvenOdd = new MyEvenOdd();
        System.out.println(" Before");
    }

    @Test
    public void testEvenOddNumber() {
        // MyEvenOdd meo = new MyEvenOdd();
        boolean actual = myEvenOdd.isEvenNumber(num);
        System.out.println(num);
        System.out.println("  expected " + expected);
        System.out.println("  actual " + actual);
        System.out.println(s);
        assertEquals(expected, actual);
    }
}