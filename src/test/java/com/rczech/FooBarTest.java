package com.rczech;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FooBarTest {

    public static final String EXPECTED_REPRESENTATION = "1";
    public static final int NUMBER = 1;
    public static final int DIVIDABLE_BY_THREE = 3;
    private FooBar fooBar;

    @Before
    public void setUp() throws Exception {

        fooBar = new FooBar();
    }

    @Test
    public void shouldReturnStringIntRepresentationWhenPutIn() {
        //given

        //when
        String result = fooBar.convertToString(NUMBER);

        //then
        Assert.assertEquals(EXPECTED_REPRESENTATION, result);


    }

    @Test
    public void shouldReturnStringFooWhenIntIsDividableByThree() {
        //given
        int number = DIVIDABLE_BY_THREE;
        //when
        String result = fooBar.convertToString(DIVIDABLE_BY_THREE);
        //then
        Assert.assertEquals("Foo", result);
    }

    @Test
    public void shouldReturnStringBarWhenIntIsDividableBtFive() {
        //given
        int number = 15;
        //when
        String result = fooBar.convertToString(15);
        //then
        Assert.assertEquals("Bar", result);
    }
}

