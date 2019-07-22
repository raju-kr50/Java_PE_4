package com.stackroute;

public class ReplaceCharacter {
    public String characterReplacer(String inputString) {
        if (inputString==null){
            return null;
        }
        String newString = inputString.replace("d","f").replace("l","t");
        return newString;
    }
}
