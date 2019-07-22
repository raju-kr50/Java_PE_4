package com.stackroute;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringMatcher {
    public String stringMatcher(String inputString, String checkString) {
        String result = "";
        if (inputString == null) {
            return null;
        }

        if (inputString.contains(checkString)) {
            Pattern pattern = Pattern.compile(checkString);
            java.util.regex.Matcher matcher = pattern.matcher(inputString);
            while (matcher.find()) {
                result += "Found at: " + matcher.start() + "-" + matcher.end() + "\n";
            }
        }
        System.out.println(result);
        return result;
    }
}
