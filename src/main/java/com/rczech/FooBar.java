package com.rczech;

public class FooBar {
    public String convertToString(int number) {
        if(number%3 ==0) {
            return  "Foo";
        }
        return String.valueOf(number);

    }
}
