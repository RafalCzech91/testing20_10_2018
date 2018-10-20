package com.rczech;

public class FooBar {

    public static final String REPRESENTATION_DIVIDABLE_BY_THREE = "Foo";

    public String convertToString(int number) {
        if (number % 3 == 0) {
            return REPRESENTATION_DIVIDABLE_BY_THREE;
        }
        return String.valueOf(number);

    }
}
