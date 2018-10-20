package com.rczech;

public class FooBar {

    public static final String REPRESENTATION_DIVIDABLE_BY_THREE = "Foo";
    public static final String REPRESENATION_DIVIDABLE_BY_FIVE = "Bar";

    public String convertToString(int number) {
        if (number%5 ==0) {
            return REPRESENATION_DIVIDABLE_BY_FIVE;
        }
        if (number % 3 == 0) {
            return REPRESENTATION_DIVIDABLE_BY_THREE;
        }
        return String.valueOf(number);

    }
}
