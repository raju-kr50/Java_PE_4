package com.stackroute;

public class CountOccuranceOfCharacter {
    public String countOccurance(String inputString, char character) {
        inputString = inputString.toLowerCase();
        if (inputString.length() == 0) {
            return "Error: This is null";
        } else {
            int count = inputString.length() - inputString.replace("a", "").length();
            return "The number of occurance of " + character + " in the string is " + count;
        }
    }
}
