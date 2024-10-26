package org.example;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.length() < 2){
            if(numbers.length() == 0){
                return 0;
            }else{
                return Integer.parseInt(numbers);
            }
        }

        return Integer.parseInt(numbers.split(",")[0].trim())+Integer.parseInt(numbers.split(",")[1].trim());
    }

}