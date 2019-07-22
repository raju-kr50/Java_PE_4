package com.stackroute;

public class Transpose {
    public String transposeString(String inputString) {
        String reversedString="";
        String newString="";
        if (inputString==null){
            return null;
        }
        String[] inputStringArray = inputString.split(" ");

        for (int i = 0; i < inputStringArray.length; i++) {
            String word = inputStringArray[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedString += word.charAt(j);
            }
            reversedString+=" ";
            newString = reversedString.trim();
        }
                return newString;
    }
}
