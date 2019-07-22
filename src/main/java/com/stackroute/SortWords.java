package com.stackroute;

public class SortWords {

    public String sort(String inputString) {
        String temp;
        String result="";
        if (inputString==null) {
            return null;
        }
        inputString=inputString.toLowerCase();
        String[] arrayString = inputString.split(" ");
        for(int i = 0; i<arrayString.length;i++){
            for (int j =i+1; j<arrayString.length;j++ ){
                if (arrayString[i].compareTo(arrayString[j])>0){
                    temp = arrayString[i];
                    arrayString[i]=arrayString[j];
                    arrayString[j]=temp;
                }
            }
        }
        for (int i = 0; i < arrayString.length; i++)
        {
            result += arrayString[i] + " ";
        }

        return result;
    }
}
