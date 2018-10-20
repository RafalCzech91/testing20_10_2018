package com.rczech;

import org.junit.Assert;
import org.junit.Test;

public class FooBarTest {

    public static final String EXPECTED_REPRESENTATION = "1";
    public static final int NUMBER = 1;

    @Test
    public void shouldReturnStringIntRepresentationWhenPutIn() {


        //given

        //when
       String result = new FooBar().convertToString(NUMBER);


        //then
        Assert.assertEquals(EXPECTED_REPRESENTATION,result);




    }


}

