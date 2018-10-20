package com.rczech;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FooBarTest {

    public static final String EXPECTED_REPRESENTATION = "1";
    public static final int NUMBER = 1;
    public static final int DIVIDABLE_BY_THREE = 3;
    public static final int DIVIDABLE_BY_FIFTEEN = 15;
    public static final int NUMBER1 = DIVIDABLE_BY_FIFTEEN;
    public static final int DIVIDABLE_BY_FIVE = NUMBER1;
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
        int number = DIVIDABLE_BY_FIVE;
        //when
        String result = fooBar.convertToString(DIVIDABLE_BY_FIVE);
        //then
        Assert.assertEquals("Bar", result);
    }

    @Test
    public void sholudshouldReturnStringBarWhenIntIsDividableBtFifteen() {
        //given
        int number = DIVIDABLE_BY_FIFTEEN;
        //when
        String result = fooBar.convertToString(DIVIDABLE_BY_FIFTEEN);
        //then
        Assert.assertEquals("FooBar", result);
    }
}

