package com.stackroute;

public class IsHarry {
    public String stringMatcher(String inputString) {
        String result="";
        result = "Is Harry here ? "+inputString.matches(".*Harry.*");
        System.out.println(result);
        return result;
    }
}
